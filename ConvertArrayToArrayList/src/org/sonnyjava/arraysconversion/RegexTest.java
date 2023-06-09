package org.sonnyjava.arraysconversion;

public class RegexTest {

    public static void main(String[] args) {
        
       boolean result =  "@".matches("/[ A-Za-z0-9_@./#&+-]*$/");
       System.out.println(result);
        

    }

}
