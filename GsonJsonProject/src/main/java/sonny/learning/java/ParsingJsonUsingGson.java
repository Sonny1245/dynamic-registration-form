package sonny.learning.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParsingJsonUsingGson {

    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws FileNotFoundException {
        
       
        JsonParser parserObj = new JsonParser();
        
        FileReader reader = new FileReader(".//jsonfile//employees.json");
        
        JsonElement jsonEle = parserObj.parse(reader);
        
        JsonObject jsonObj = jsonEle.getAsJsonObject();
        
        JsonArray jsonArr = jsonObj.get("employee").getAsJsonArray();
        for(int i=0; i<jsonArr.size(); i++) {
            
            JsonObject employee = (JsonObject) jsonArr.get(i);
            int id =  employee.get("id").getAsInt();
            String first_name =  employee.get("firstName").getAsString();
            String last_name =  employee.get("lastName").getAsString();
            String dob =  employee.get("DOB").getAsString();
            String email =  employee.get("email").getAsString();
            
            System.out.println("ID: "+ id + "\nFirst Name: "+first_name
                    +"\nLast Name: "+last_name +"\nDOB: "+dob+"\nEmail: "+email);
            
        }
        
      

    }

}
