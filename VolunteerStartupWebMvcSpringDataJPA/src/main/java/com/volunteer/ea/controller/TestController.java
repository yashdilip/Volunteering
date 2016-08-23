package com.volunteer.ea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dilip on 8/22/2016.
 */
@Controller
public class TestController {
    @RequestMapping("/load")
    public String loadView(){
        return "myView";
    }
}
