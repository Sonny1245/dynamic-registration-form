package learning.sonny.java;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonHttpClient {

    public static void main(String[] args) {
        
        //Java 11:
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/users")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        //.thenAccept(System.out::println)
        .thenApply(ReadJsonHttpClient::parse)
        .join();        

    }
    
    public static String parse(String responseBody) {
        JSONArray albums = new JSONArray(responseBody);
        for(int i=0; i<albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            System.out.println(album);
            //int id = album.getInt("id");
            //String name = album.getString("name");
            //String username = album.getString("username");
            //String email = album.getString("email");
            //String address = album.getString("address");
            //JSONObject address = albums.toJSONObject("address");
            
            //System.out.println(id + " "+ name +" "+username+" "+email);
        
    }
    
        return null;
    } 
}
