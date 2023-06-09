package com.sonnyjava.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonnyjava.lc.api.RegistrationDTO;

@Controller
public class RegistrationController {
    
    @RequestMapping("/register")
    public String registrationPage(@ModelAttribute("userReg") RegistrationDTO dto) {
        
        return "register-home-page";
        
    }
    
    //Note: To use <c:forEach> loop inside the "response-registration-success".jsp
    //We need:
    // 1) jstl core dependency jar inside the porm.xml file
    // 2) <c: forEach> tag inside the "response-registration-success".jsp file
    @RequestMapping("/registration-success")
     public String processUserReg(@ModelAttribute("userReg") RegistrationDTO dto) {
         
         return "response-registration-success";
     }
  } 



