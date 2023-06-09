import java.util.Arrays;

public class ReverseWordsInTheSamePosition {

    public static void main(String[] args) {
        
        
        String str = "Welcome to Java";
        
        String[] words = str.split("\\s");
        
        System.out.println(Arrays.toString(words));
        
        String revStr = "";
        
        for(String w:words) {
            
            String revWords = "";
            
            for(int i=w.length()-1; i>=0; i--) {
                revWords = revWords+w.charAt(i);
                
                System.out.println(revWords);
            }
            
            revStr = revStr + revWords+ " ";
            
        }
        
        
        
        System.out.println(revStr);

    }

}
