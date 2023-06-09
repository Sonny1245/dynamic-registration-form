
public class LinearSearch {

    public static void main(String[] args) {
        
        
        int a[] = {100, 25, 56, 78, 96, 102};//Does not need to be sorted
        
        int keySearch = 56;
        
        boolean flag = false;
        
        for(int i =0; i<a.length; i++) {
            if(keySearch == a[i]) {
                System.out.println(keySearch+ " is found at position: " +i);
                flag = true;
                //break;
            }
        }
        
        if(flag == false) {
            System.out.println(keySearch + " is not found at all.");
        }
    }

}
