package sonnyjava.learning;

public class DebugExamples {

    public static void main(String[] args) {
        
        int i=20;
        int j = 30; 
        int k= 0;
        
        k = additionMethod(i,j); //k=50
        System.out.println("Value of k is: "+ k);
        int x = 50;
        int y=0;
        
        y = k+x; 
        System.out.println("Value of y is: "+ y);//y=100
        

    }
    
    public static int additionMethod(int a, int b) {
        
        int c = a+b;
        return c;
    }

}
