package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetPetByStatusSteps {
    
    Response response;
    
    @When("^I send get request to get all pet which has status (|available|pending|sold|)$")
   // @When("I send get request to get pet which has (.*)status")
    public void iSendGetRequestToGetAllPetWhichHasStatusValue(String status) {
        String url = "https://petstore.swagger.io/v2/pet/findByStatus";
        
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("status",status )
                .when().log().all()
                .get(url);
        response.then().log().all();
    }
    
    
    
    @Then("^I validate the successful response for get pet by status(.*)$")
    public void iValidateTheSuccessfulResponseForGetPetByStatus( String status) {
        response.then().statusCode(200);
        
        
        if(status.equals("invalid")){
            Assert.assertTrue(((List)response.body().path("")).size()==0);
          
        }else{
            List jasonList = response.body().path("");
            Map jason = (Map)jasonList.get(0);
            Assert.assertTrue(jasonList.size()>=1);
            Assert.assertNotNull(jason.get("id"));
            Assert.assertNotNull(jason.get("name"));
            Assert.assertNotNull(jason.get("photoUrls"));
            Assert.assertNotNull(jason.get("tags"));
            Assert.assertNotNull(jason.get("category"));
            Assert.assertNotNull(jason.get("status"));
        }
    }
    
    @Then("I validate the successful response for get pet by invalid status")
    public void iValidateTheSuccessfulResponseForGetPetByInvalidStatus() {
    }
    
}
