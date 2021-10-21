package com.vicketrossing.springbootthymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String showHomePage(){
        return "redirect:login";
    }

    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request){

        if(request.isUserInRole("ROLE_ADMIN")){
            return "redirect:/admin/";
        }

        return "redirect:/store/";
    }

    @GetMapping("/login")
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

    @GetMapping("/login_failed")
    public String loginFailed(){
        return "login_failed";
    }


}
