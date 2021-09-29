package com.vicketrossing.springbootthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserRepository;
import com.vicketrossing.springbootthymeleaf.user.UserService;

import java.util.List;

@Controller
public class MainController {



    @GetMapping("")
    public String showHomePage(){
        System.out.println("main controller");
        return "index";
    }



    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
