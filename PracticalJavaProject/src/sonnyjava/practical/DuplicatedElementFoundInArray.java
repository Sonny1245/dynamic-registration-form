package sonnyjava.practical;

public class DuplicatedElementFoundInArray {

    public static void main(String[] args) {
        
        String a[]= {"java","react","python","Java", "java"};
        
        boolean flag = false;
        
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                
                if(a[i]==a[j]) {
                    System.out.println("Duplicated Element found: "+ a[i]);
                    flag = true;
                    break;
                }
            }
        }
        
        if(flag==false) {
            System.out.println("No Duplicated Element Found!");
        }
        

    }

}
