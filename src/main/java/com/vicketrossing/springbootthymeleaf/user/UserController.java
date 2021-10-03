package com.vicketrossing.springbootthymeleaf.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class UserController {


    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUserList(Model model) {
        List<User> listUsers = userService.getUsers();

        model.addAttribute("listUsers", listUsers);

        return "users";
    }


    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId") Long id){
        userService.deleteUser(id);

        return "redirect:/users";
    }
}
