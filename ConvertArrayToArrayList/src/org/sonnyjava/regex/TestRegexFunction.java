package org.sonnyjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexFunction {

    public static void main(String[] args) {
    
        String regex = "[A-Za-z0-9_]";
  
        // Create a pattern from regex
        Pattern pattern = Pattern.compile(regex);
  
        // Get the String to be matched
        String stringToBeMatched = "{";
        System.out.println(stringToBeMatched.length());
  
        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);
  
        // Get the subsequence using find() method
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        
        if(!matchFound && stringToBeMatched.length() < 2) {
            
            System.out.println(!matchFound);
            System.out.println("Subsequence of strings is found.");            
       }else{
           System.out.println("Subsequence of the strings is not found.");
           
       }

    }

}
