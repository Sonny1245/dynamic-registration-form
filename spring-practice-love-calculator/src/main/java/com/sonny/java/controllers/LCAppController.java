package com.sonny.java.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonny.java.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
    
    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfor") UserInfoDTO userInfo) {
        return "home-page";
    }
    
    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfor") 
           UserInfoDTO userInfo, BindingResult result) { 
        
        System.out.println(userInfo.isTermAndCondition());
        
        if(result.hasErrors()) {
            
            List<ObjectError> allErrors = result.getAllErrors();
            
            for(ObjectError temp: allErrors) {
                System.out.println(temp);      
                
            }
            
            return "home-page";
            
        }
        return "result-page";
    }

}
