package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.petstore.AddPet;

import java.net.URL;

public class DeletePetSteps {
    AddPetSteps addPetSteps = new AddPetSteps();
    public Response response;
    
  //public void deleteId(){
      //RestAssured.delete("https://petstore.swagger.io/v2/pet/11");
 
  
@When("I send request to delete with valid url and valid pet ID")
public void ISendRequestToDeleteWithValidUrlAndValidPetID(){
      int id = AddPetSteps.addPet.getId();
      String url = "https://petstore.swagger.io/v2/pet/";
      url = url.concat(String.valueOf(id));
   // response = addPetSteps.response;
    response = RestAssured.given()
            .accept(ContentType.JSON)
            .when().log().all()
            .delete(url);
    response.then().log().all();
    
    
}
    
    @Then("I validate the successful response for delete pet")
    public void iValidateTheSuccessfulResponseForDeletePet() {
   response.then().statusCode(200);
    }
}

