package com.vicketrossing.springbootthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserRepository;
import com.vicketrossing.springbootthymeleaf.user.UserService;

import java.util.List;

@Controller
public class MainController {



    @GetMapping("/home")
    public String showHomePage(){
        System.out.println("main controller");
        return "index";
    }



    @GetMapping("/login_page")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("user", new User());

        return "register";
    }

    @GetMapping("/add_user")
    public String addUser(){
        return "add-user";
    }
}
