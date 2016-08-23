package com.volunteer.ea.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Dilip
 *
 */
@Controller
@RequestMapping("/login")
public class UserController {
    @RequestMapping("/handleLogin")
    public String handleLogin(){
        String view = "";
        if (userHasAuthority("ROLE_ADMIN")) view = "/admin/dashboard";
        else if(userHasAuthority("ROLE_VOLUNTEER")) view = "/volunteer/dashboard";
        return "redirect:"+view;
    }

    public boolean userHasAuthority(String authority)
    {
        List<GrantedAuthority> authorities = getUserAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (authority.equals(grantedAuthority.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    public List<GrantedAuthority> getUserAuthorities(){
        return (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
    }
}
