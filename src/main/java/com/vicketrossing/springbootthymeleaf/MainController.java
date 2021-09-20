package com.vicketrossing.springbootthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHomePage(){
        System.out.println("main controller");
        return "index";
    }

    @GetMapping("/users")
    public String showUsers(){
        return "users";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
