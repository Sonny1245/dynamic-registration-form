package practicalMethods;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        
        
        int a =10, b=20;
        
        System.out.println("Before swapping 2 numbers a =  " +a+ " and b = "+b);
        
        int temp;
        
        temp = a;
        a=b;
        b= temp;
        
        System.out.println("After swapping 2 numbers a =  " +a +" and b = "+b);
        

    }

}
