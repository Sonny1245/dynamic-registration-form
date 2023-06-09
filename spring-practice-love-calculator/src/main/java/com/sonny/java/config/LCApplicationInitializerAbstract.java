package com.sonny.java.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sonny.java.config.LoveCalConfig;

public class LCApplicationInitializerAbstract extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] arr = {LoveCalConfig.class};
        
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
        String[] arr = {"/"};
        
        return arr;
    }

}
