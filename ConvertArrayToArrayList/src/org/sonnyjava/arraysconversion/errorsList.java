package org.sonnyjava.arraysconversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class errorsList {

    public static void main(String[] args) {
        
        String a = "errors.exception.early.renewal";
        
        //String[] doNotPrint = {"errors.exception.early.renewal"};
        
        List<String> errorsList = new ArrayList<String>(Arrays.asList(FCContants.doNotPrint));
        
            if (errorsList.contains(a)) {
                System.out.println(errorsList);
        }
            
            System.out.println(errorsList);

    }

}
