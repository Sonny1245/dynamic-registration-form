import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
    
    @Test
    void getWeatherDetails() {
        
        RestAssured.baseURI=("https://jsonplaceholder.typicode.com/users");
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET);
        
        String responseBody = response.getBody().asString();
        
        System.out.println("Response Body is: "+ responseBody);
        
        int statusCode =response.getStatusCode();
        System.out.println("Status Code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);
        
        String statusLine = response.getStatusLine();
        System.out.println("Status Line is: " + statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        
    }

}
