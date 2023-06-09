package JsonPrjoject.JsonPrjoject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFilesInJava {

    public static void main(String[] args) throws IOException, ParseException {
        
        JSONParser jsonparser = new JSONParser();
        
        FileReader reader = new FileReader(".//jsonfiles//employee.json");
        
        Object obj = jsonparser.parse(reader);
        
        JSONObject emplJsonObj = (JSONObject) obj;
        
        //System.out.println(emplJsonObj);
        String fname = (String)emplJsonObj.get("firstName");
        String lname = (String)emplJsonObj.get("lastName");
        
        System.out.println("Fist Name is: "+ fname);
        System.out.println("Last Name is: "+ lname);
        
        //Next: since address is an Array of objects:
        JSONArray array = (JSONArray) emplJsonObj.get("address");
        System.out.println("Array of objects: " + array);
        
        //Then we must loop through to exact each object inside:
        for(int i=0; i<array.size(); i++) {
            
            JSONObject address = (JSONObject) array.get(i);
            
            String street = (String) address.get("street");
            String city = (String) address.get("city");
            String state = (String) address.get("state");
            
            System.out.println("Address of index: " +i+ " as follows:");
            System.out.println("Street is: "+ street);
            System.out.println("City is: "+ city);
            System.out.println("State is: "+ state);
            
        }
        

    }

}
