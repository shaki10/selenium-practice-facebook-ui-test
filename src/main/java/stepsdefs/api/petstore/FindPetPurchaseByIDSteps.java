package stepsdefs.api.petstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.ValidatableResponseImpl;
import io.restassured.response.Response;

public class FindPetPurchaseByIDSteps {
    
    Response response;
    String url;
    
    @Given("I have valid ID for find purchase")
    public void IHaveValidIDForFindPurchase(){
        
        String url = "https://petstore.swagger.io/v2/store/order/1";
        
        
        
    }
    
    @When("I send GEt request to find the purchase in the store")
    public void iSendGEtRequestToFindThePurchaseInTheStore() {
    
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .when().log().all()
                .get(url);
        response.then().log().all();
    
    
    
    }
    
    @Then("I validate the purchase history")
    public void iValidateThePurchaseHistory() {
        response.then().statusCode(200);
        response.then().log().all();
        
    }
}
