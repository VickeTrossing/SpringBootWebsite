package com.vicketrossing.springbootthymeleaf.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/")
    public String frontPage(Model model){

        List<Store> listProducts = storeService.getProducts();
        model.addAttribute("listProducts", listProducts);

        return "store/frontpage";
    }
}
