package sonny.learning.java;

public class FunUtilsForJSPCall {
    
    public static String revString(String data) {
        
        
         int len = data.length() -1;
         String revStr = "";
         
         for(int i = len; i>=0; i--) {
             revStr += data.charAt(i);
         }
        
        return revStr;
    }

}
