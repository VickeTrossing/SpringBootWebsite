package user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers = userService.listAll();


        model.addAttribute("listUsers", listUsers);

        return "users";
    }


    public void test(){

        int j = 0;

        for (int i = 0; i < 0; i++){
            System.out.println(i);
        }
    }
}
