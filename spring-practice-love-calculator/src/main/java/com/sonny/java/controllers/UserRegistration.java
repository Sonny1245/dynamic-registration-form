package com.sonny.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonny.java.lc.api.UserRegDTO;

@Controller
public class UserRegistration {
    
    @RequestMapping("/register")
    public String showUserReg(@ModelAttribute("useReg") UserRegDTO dto) {
        
        return "register-page";
    }
    
    @RequestMapping("/register-success")
    public String regiterSuccessPage(@ModelAttribute("useReg") UserRegDTO dto) {
        
        return "register-succespage";
    }

}
