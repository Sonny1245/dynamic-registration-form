import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RamdomNumber {

    public static void main(String[] args) {
        
        //Random rand = new Random();
        
        //int randInt = rand.nextInt(10);
        //System.out.println(randInt);
        
        //double randDbl = rand.nextDouble(); //default from 0.0 to 0.9999
        //System.out.println(randDbl);
        
        //double randDbl = Math.random(); //default also
        //System.out.println(randDbl);
        
        //Approach 3: commnon-lang3 API
        //https://commons.apache.org/proper/commons-lang/download_lang.cgi
        
        String randomNum = RandomStringUtils.randomNumeric(10);
        System.out.println(randomNum);
        
        String randomStr = RandomStringUtils.randomAlphabetic(26);
        System.out.println(randomStr);
        

   }

}
