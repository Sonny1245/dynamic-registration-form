package com.sonnyjava.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonnyjava.lc.api.LCApplicationDTO;



@Controller
public class LoveCalController {
    
    @RequestMapping("/homepage")
    public String homepage(@ModelAttribute("userInfo")LCApplicationDTO lcaDTO) {
         
        return "home-page";
    }
    
    @RequestMapping("/process-homepage")
    public String responsePage(@Valid @ModelAttribute("userInfo")
        LCApplicationDTO lcaDTO, BindingResult result) {
        
            if(result.hasErrors()) {   
                List<ObjectError> allErrors = result.getAllErrors();
                    for(ObjectError temp:allErrors ) {
                       System.out.println(temp);
                    }
                
                return "home-page";
            }
        
        return "response-homepage";
    }

}
