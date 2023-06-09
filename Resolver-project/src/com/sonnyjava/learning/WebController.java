package com.sonnyjava.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    
    @RequestMapping("/test")
    public String getWeb() {
        return "website";
    }

}
