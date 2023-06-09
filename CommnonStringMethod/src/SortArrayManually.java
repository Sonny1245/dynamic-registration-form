import java.util.Arrays;

public class SortArrayManually {

    public static void main(String[] args) {

        int a[] = { 32, 45, 1, 4, 5, 6, 101, 99, 78, 65, 43 };

      /*  int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }

        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

        System.out.println(); */
        
        Arrays.sort(a);
        System.out.printf("Sorted Array: %s",Arrays.toString(a)+ " " + "\n");
        for(int x: a) {
            System.out.print(x + " ");
        }
        
        System.out.println();
    }

}
