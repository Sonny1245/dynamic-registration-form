package com.password;

import java.util.Random;

public class GeneratedRandomPassword {

    public static void main(String[] args) {
        
        System.out.println(generatePassword().substring(0,9));

    }
    
    public static String generatePassword() {
        
        Random random = new Random();
        
        String generatedPassWord ="";
        
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$?*&%";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        int len = combinedChars.length();
        
        
        for(int i = 0; i< combinedChars.length() ; i++) {
           generatedPassWord += combinedChars.charAt(random.nextInt(len));
          }
               return generatedPassWord;
          }

}
