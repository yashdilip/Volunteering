package cs544.mum.edu.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.mum.edu.domain.User;

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

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String saveUser(Model model){
    	model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String saveUserForm(Model model){
        return "reditect:/save";
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

    @SuppressWarnings("unchecked")
	public List<GrantedAuthority> getUserAuthorities(){
        return (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
    }
}
