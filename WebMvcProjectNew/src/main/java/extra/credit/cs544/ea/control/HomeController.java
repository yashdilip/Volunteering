package extra.credit.cs544.ea.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dilip on 8/22/2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/test")
    public String home(Model model){
        model.addAttribute("hello","Welcome Page");
        return "user/index";
    }
    @RequestMapping(value = "/dilip")
    public String helloToDilip(Model model){
        return "admin/dilip";
    }
}
