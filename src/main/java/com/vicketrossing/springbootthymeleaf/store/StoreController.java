package com.vicketrossing.springbootthymeleaf.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/store")
public class StoreController {

    @GetMapping("/")
    public String frontPage(){
        return "store/frontpage";
    }


}
