package loveCal.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import loveCal.lc.DTO.UserInfoDTO;

@Controller
public class LoveCalAppController {
    
    @RequestMapping("/home-page")
    public String showHomePage(@ModelAttribute("info") UserInfoDTO dto) {
        
        return "home-page";
    }
    
    @RequestMapping("/homepage-process")
    public String showHomePageResult(@Valid @ModelAttribute("info")
    UserInfoDTO dto, BindingResult result) {
        
        if(result.hasErrors()) {
            
            List<ObjectError> allErrors = result.getAllErrors();
            for(ObjectError temp : allErrors) {
                System.out.println(temp);        
            }
            
            return "home-page";
        }
        
        return "homepage-result";
    }

}
