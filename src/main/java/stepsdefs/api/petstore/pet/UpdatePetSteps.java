package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class UpdatePetSteps {
    
    String payLoadForUpdatePet;
    String URL;
    Response response;
    
    @Given("I have valid URL with all the valid information")
    public void IHaveValidURLWithAllTheValidInformation() {
        URL = "https://petstore.swagger.io/v2/pet";
    
        payLoadForUpdatePet ="{\n" +
                "  \"id\": 12,\n" +
                "  \"category\": {\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Husky\"\n" +
                "  },\n" +
                "  \"name\": \"Chase\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"www.petstore.com/update\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 12,\n" +
                "      \"name\": \"Jade\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"sold\"\n" +
                "}";
                
    }
    
    @When("I sent the Put request with valid header")
    public void iSentThePutRequestWithValidHeader() {
    
        RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON);
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(payLoadForUpdatePet).when().log().all().when()
                .put(URL);
    
    }
    
    @Then("I validate the successful response to the store")
    public void iValidateTheSuccessfulResponseToTheStore() {
        
        response.then().statusCode(200);
        response.then().log().all();
    
        Assert.assertEquals((int) response.body().path("id"),12);
        Assert.assertEquals((int) response.body().path("category.id"),12);
        Assert.assertEquals(response.body().path("category.name"),"Husky");
        Assert.assertEquals(response.body().path("name"),"Chase");
        Assert.assertEquals(response.body().path("photoUrls[0]"),"www.petstore.com/update");
        Assert.assertEquals((int) response.body().path("tags[0].id"),12);
        Assert.assertEquals(response.body().path("tags[0].name"),"Jade");
        Assert.assertEquals(response.body().path("status"),"sold");
    }
}
