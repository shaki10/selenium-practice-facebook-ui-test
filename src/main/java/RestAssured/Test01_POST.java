package RestAssured;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.petstore.AddPet;

public class Test01_POST {
    AddPet addPet = new AddPet();
    Response response;
    
    @Test
    @Given("test_o1")
    public void test_01() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        
        System.out.println(response.getBody().asString());
        System.out.println(response.getBody().jsonPath());
        System.out.println(response.getStatusCode());
        System.out.println(response.statusLine());
        System.out.println(response.getHeader("Content-type"));
        System.out.println(response.getTime());
    
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
        response.then().log().all();
        response.then().log().all();
        response.body().asString().equals("data.id[0],7");
        
        }
    }



