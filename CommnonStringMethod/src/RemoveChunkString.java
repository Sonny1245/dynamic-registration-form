
public class RemoveChunkString {

    public static void main(String[] args) {
        
        String str = "%$%?*&@ sonny %$# Nguyen we 214333434";
        
        str = str.replaceAll("[^a-zA-Z0-9]", " ").trim();
        
         String str1 = str.replace(" ", " ");
        
        System.out.println(str1);        
        

    }

}
