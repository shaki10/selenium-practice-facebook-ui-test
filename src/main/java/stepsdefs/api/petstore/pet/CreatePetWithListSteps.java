package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import pojo.petstore.pet.Category;
import pojo.petstore.pet.PetWithList;

public class CreatePetWithListSteps {
    
    public static PetWithList petWithList;
    String URL;
    public static Response response;
    
    @Given("I have valid URL with all the valid data to create pet list")
    public void IHaveValidURLWithAllTheValidDataToCreatePetList(){
        URL = "https://petstore.swagger.io/v2/user/createWithList";
        
        petWithList = new PetWithList();
        petWithList.setId(11);
        petWithList.setUsername("Tommy23");
        petWithList.setFirstName("Tom");
        petWithList.setLastName("Jerry");
        petWithList.setPassword("232323");
        petWithList.setPhone("1232343445");
        petWithList.setUserStatus(1);
    }
    
    
    @When("I sent the POST request with valid header to make list")
    public void iSentThePOSTRequestWithValidHeaderToMakeList() {
        RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON);
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .body(petWithList).when().log().all().when()
                .post(URL);
    }
    
    @Then("I validate the successful response to the list")
    public void iValidateTheSuccessfulResponseToTheList() {
        response.then().statusCode(200);
        response.then().log().all();
    
        Assert.assertEquals((int) response.body().path("id"),petWithList.getId());
        Assert.assertEquals(response.body().path("username"),petWithList.getUsername());
        Assert.assertEquals(response.body().path("firstname"),petWithList.getFirstName());
        Assert.assertEquals(response.body().path("lastname"),petWithList.getLastName());
        Assert.assertEquals(response.body().path("password"),petWithList.getPassword());
        Assert.assertEquals((int)response.body().path("phonenumber"),petWithList.getPhone());
        Assert.assertEquals((int)response.body().path("userstatus"),petWithList.getUserStatus());
    }
}
