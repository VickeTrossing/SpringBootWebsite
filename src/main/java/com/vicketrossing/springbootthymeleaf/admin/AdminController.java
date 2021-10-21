package com.vicketrossing.springbootthymeleaf.admin;

import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

        User user = userService.findUser(id);

        if(Objects.equals(user.getRoles(), "ROLE_ADMIN")){
            System.out.println("You cant delete user with ADMIN rights");
        }else{
            userService.deleteUser(id);
        }

        return "redirect:/admin/manage_user";
    }


    @GetMapping("/add_user")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "add-user";
    }

    @GetMapping("/user_created")
    public String newUserCreated(){
        return "created_user";
    }


}
