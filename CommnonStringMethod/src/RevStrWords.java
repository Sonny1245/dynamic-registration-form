public class RevStrWords {

    public static void main(String[] args) {
            
        String str = "Welcome To Java";
        
        String revStr = "";
        
        String a[] = str.split(" ");
        //The samne as: String a[] = str.split("\\s");
               
        for(String w: a) {
            StringBuilder sb =  new StringBuilder();
            sb.append(w).reverse();
            
            revStr += sb + " ";
            
        }
        
        System.out.println(revStr);

    }

}
