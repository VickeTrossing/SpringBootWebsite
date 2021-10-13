package com.vicketrossing.springbootthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserRepository;
import com.vicketrossing.springbootthymeleaf.user.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;


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


    @PostMapping("/process_register")
    public String saveUSer(@ModelAttribute("user") User newUser){

        userService.save(newUser);

        return "user-created";
    }


}
