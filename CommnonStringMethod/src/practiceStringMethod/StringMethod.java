package practiceStringMethod;

public class StringMethod {

    public static void main(String[] args) {
        
        String[] words = {"apple", "banana", "kiwi","mango", "application"};
        for(String word: words) {
            if(word.startsWith("app"))
                System.out.println(word + " start with app");
        }
        
        for(String word: words) {
            if(word.endsWith("ana"))
                System.out.println(word + " end with ana");
        }     

    }

}
