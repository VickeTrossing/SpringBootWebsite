package com.vicketrossing.springbootthymeleaf.admin;

import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    @GetMapping("/")
    public String showHomePage(){
        return "admin-index";
    }


    @GetMapping("/manage_user")
    public String showUserList(Model model) {
        List<User> listUsers = userService.getUsers();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }


    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId") Long id){
        userService.deleteUser(id);

        return "redirect:/admin/manage_user";
    }

    @GetMapping("/add_user")
    public String addUser(){
        return "add-user";
    }
}
