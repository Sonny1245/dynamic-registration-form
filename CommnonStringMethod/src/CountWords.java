import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word of string: ");
        
        String words = sc.nextLine();
        
        int count = 1;
        
        for(int i=0; i<words.length(); i++) {
            if((words.charAt(i) == ' ') && (words.charAt(i+1)!= ' ')) {
                count++;
            }
        }
        
        System.out.println(count);

    }

}
