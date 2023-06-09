
public class CountCharactersOccurrences {

    public static void main(String[] args) {
        
        
        //Approach 1:
        
        String str = "elephant";
        
        /*char lettersOccurrence = 'e';
        int count =0;
        
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==lettersOccurrence) {
                count++;
            }
        }
        
        System.out.println(count);*/
        
        
        //Approach 2:
        int totalLength = str.length();
        int lengthAfterRemoveLetters = str.replace("h", "").length();
        
        int count = totalLength - lengthAfterRemoveLetters;
        
        System.out.println(count);

    }

}
