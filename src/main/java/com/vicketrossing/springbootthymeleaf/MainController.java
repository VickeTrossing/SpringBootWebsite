package com.vicketrossing.springbootthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import user.User;
import user.UserRepository;
import user.UserService;

import java.util.List;

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

    @GetMapping("/test")
    public String showUserList1() {
        return "test";
    }
}
