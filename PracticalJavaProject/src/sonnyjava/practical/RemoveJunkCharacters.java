package sonnyjava.practical;

public class RemoveJunkCharacters {

    public static void main(String[] args) {
        
        String str = "&%$>^* abasf 1234AcBD";
        
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        
        //str.replaceAll("\\s", "") to remove all whitespaces
        
        System.out.println(str1);

    }

}
