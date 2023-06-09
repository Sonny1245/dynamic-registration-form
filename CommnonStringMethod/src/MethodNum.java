import java.util.Scanner;

public class MethodNum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();
        
        int result = largerInt(a,b);
        
        System.out.println("Larger Number is: "+ result);
        

    }
    
    public static int largerInt(int a, int b) {
        
        int compNumbers = a>b?a:b;
        
        return compNumbers;
        
        
    }

}
