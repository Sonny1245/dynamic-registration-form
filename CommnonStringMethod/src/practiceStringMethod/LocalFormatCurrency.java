package practiceStringMethod;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LocalFormatCurrency {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount money you like: ");
        double payment = sc.nextDouble();
        sc.close();
        
        String us =NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String fr =NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String in = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String vn =NumberFormat.getCurrencyInstance(new Locale("en","vn")).format(payment);
        
        System.out.println("US: "+us);
        System.out.println("France: "+fr);
        System.out.println("Indian: "+in);
        System.out.println("VietName: "+vn);
        

    }

}
