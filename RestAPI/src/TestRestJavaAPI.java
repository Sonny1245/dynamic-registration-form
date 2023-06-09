import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestRestJavaAPI {

    public static void main(String[] args) throws IOException {
        
        URL url = new URL("https://jsonplaceholder.typicode.com/users");
        
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        
        BufferedReader buff = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        
        String output;
        
        while((output = buff.readLine()) != null) {
            
            System.out.println(output);
        }

    }

}
