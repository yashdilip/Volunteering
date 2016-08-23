package extra.credit.cs544.ea.control;

import extra.credit.cs544.ea.domain.Address;
import extra.credit.cs544.ea.domain.User;
import extra.credit.cs544.ea.service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Dilip on 8/22/2016.
 */
@Controller
//@RequestMapping(value="/admin")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/admin/adduser", method = RequestMethod.GET)
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "admin/adduser";
    }
    @RequestMapping(value = "/admin/adduser", method = RequestMethod.POST)
    public String addUserProcess(@ModelAttribute("user") User user){
        System.out.println(user.getName());
        System.out.println(user.getAddress().getStreet());
        return "redirect:/dilip";
    }
}
