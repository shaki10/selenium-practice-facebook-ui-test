package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import pojo.petstore.pet.OrderForPet;

public class OrderForPetSteps {
    
    public static OrderForPet orderForPet;
    String URL;
    public static Response response;
    @Given("I have valid URL to place and order for a pet")
    public void IHaveValidURLToPlaceAndOrderForAPet(){
        URL = "https://petstore.swagger.io/v2/store/order";
        orderForPet = new OrderForPet();
        orderForPet.setId(22);
        orderForPet.setPetId(33);
        orderForPet.setQuantity(1);
        orderForPet.setShipDate(2022-02-07);
        orderForPet.setStatus("placed");
        orderForPet.setComplete(true);
        
    }
    
    
    @When("I sent the POST request with valid header to order for a pet")
    public void iSentThePOSTRequestWithValidHeaderToOrderForAPet() {
        RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON);
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(orderForPet).when().log().all().when()
                .post(URL);
    }
    
    
    @Then("I validate the successful response to the order")
    public void iValidateTheSuccessfulResponseToTheOrder() {
        response.then().statusCode(200);
        response.then().log().all();
    
        Assert.assertEquals((int) response.body().path("id"),orderForPet.getId());
        Assert.assertEquals((int) response.body().path("petId"),orderForPet.getPetId());
        Assert.assertEquals((int)response.body().path("quantity"),orderForPet.getQuantity());
        Assert.assertEquals((int) response.body().path("shipDate"),orderForPet.getShipDate());
        Assert.assertEquals(response.body().path("status"),orderForPet.getStatus());
        Assert.assertEquals((boolean) response.body().path("complete"),orderForPet.isComplete());
    }
}
