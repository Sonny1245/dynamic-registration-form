package com.sonny.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
    
    @RequestMapping("/cafe")
    public String getCafeWeb(Model model) {
        
        return "coffee-web";
    }
    
    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request, Model model) {
        
        String customerOrder = request.getParameter("foodType");
        model.addAttribute("itemName", customerOrder);
        
        return "process-order";
    }

}
