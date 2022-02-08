package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.petstore.AddPet;

public class GetPetSteps {
    AddPetSteps addPetSteps = new AddPetSteps();
   public Response response;
   
   @When("I send request with valid url and valid pet ID")
    public void ISendRequestWithValidUrlAndValidPetID(){
        addPetSteps.a = "Dog";
       int id = addPetSteps.addPet.getId();
        String url = "https://petstore.swagger.io/v2/pet/";
          url = url.concat(String.valueOf(id));
          response = addPetSteps.response;
       response =  RestAssured.given()
                .accept(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().log().all()
                .get(url);
        
        response.then().log().all();
        
    
    }
    
    @Then("I validate the successful response for get pet")
    public void iValidateTheSuccessfulResponseForGetPet() {
        response.then().statusCode(200);
    }
}
