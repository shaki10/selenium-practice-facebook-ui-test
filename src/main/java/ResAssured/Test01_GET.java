package ResAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.petstore.AddPet;

public class Test01_GET {
    
    AddPet addPet = new AddPet();
    Response response;
    
@Test
    public void test_01(){
       response = RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
    
    
        System.out.println(response.asString());
        System.out.println(response.getBody().jsonPath());
        System.out.println(response.getStatusCode());
        System.out.println(response.statusLine());
        System.out.println(response.getHeader("Content-type"));
        System.out.println(response.getTime());
        
        int statusCode = response.statusCode();
    Assert.assertEquals(statusCode, 200);
    }
}
