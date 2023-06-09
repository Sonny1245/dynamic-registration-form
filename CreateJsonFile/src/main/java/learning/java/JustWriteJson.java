package learning.java;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JustWriteJson {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        //create json object:
        JSONObject obj = new JSONObject();
        obj.put("firstName", "John");
        obj.put("lastName", "Smith");
        
        //create new json array object:
        JSONArray arrayList = new JSONArray();
        arrayList.add("USA");
        arrayList.add("Vietname");
        arrayList.add("Canada");
        
        //Add jsonArray to jsonObject:
        obj.put("countries", arrayList);
        
        try(FileWriter file = new FileWriter("jsonfolder//info.json",false)){
            file.write(obj.toJSONString());
            file.close();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("File Created: "+obj);

    }

}
