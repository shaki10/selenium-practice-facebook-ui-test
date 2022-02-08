package stepsdefs.api.petstore.pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.testng.Assert;
import pojo.petstore.AddPet;
import pojo.petstore.pet.Category;
import pojo.petstore.pet.Tags;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddPetSteps {
    
    String payloadForAddPet;
   public static AddPet addPet;
    String URL;
   public static Response response;
  public static String a = "22";
    
    @Given("I have valid URL with all the valid data")
    public void IHaveValidURLWithAllTheValidData() {
        URL = "https://petstore.swagger.io/v2/pet";
        
       /* payloadForAddPet = "{\n" +
                "  \"id\": 11,\n" +
                "  \"category\": {\n" +
                "    \"id\":11,\n" +
                "    \"name\": \"Bulldog\"\n" +
                "  },\n" +
                "  \"name\": \"mike\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"www.pet.com/add\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\":11,\n" +
                "      \"name\": \"jade\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";*/
    
        addPet = new AddPet();
        addPet.setId(11);
        Category category = new Category();
        category.setId(11);
        category.setName("Bulldog");
        addPet.setName("mike");
        addPet.setCategory(category);
        //List<String> photourls = new ArrayList<>();
       // String[] urls = {"www.pet.com/add"};
        //addPet.setPhotoUrls(photourls);
        addPet.setPhotoUrls(Arrays.asList("www.pet.com/add"));
        Tags tag = new Tags();
        tag.setId(11);
        tag.setName("jade");
        //List<Tags> tags = new ArrayList<>();
        //tags.add(tag);
        //addPet.setTags(tags);
        addPet.setTags(Arrays.asList(tag));
        addPet.setStatus("available");
        
        
    }
    
    @When("I sent the POST request with valid header")
    public void ISentThePOSTRequestWithValidHeader() {
        
        //RestAssured.given().accept("application/json");
        //RestAssured.given().accept(ContentType.JSON);
        // RestAssured.given().headers("accept","application/json");
        // Header header = new Header("accept","application/json");
        //RestAssured.given().header(header);
        //RestAssured.given().accept(ContentType.JSON).contentType("application/json");
        
        RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON);
       
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
              .body( addPet).when().log().all().when()
                .post(URL);
     
    }
    
    @Then("I validate the successful response")
    public void IValidateTheSuccessfulResponse() {
        response.then().statusCode(200);
        response.then().log().all();
        //response.asString().equals(payloadForAddPet);
        Assert.assertEquals((int) response.body().path("id"),addPet.getId());
        Assert.assertEquals((int) response.body().path("category.id"),addPet.getCategory().getId());
        Assert.assertEquals(response.body().path("category.name"),addPet.getCategory().getName());
        Assert.assertEquals(response.body().path("name"),addPet.getName());
        Assert.assertEquals(response.body().path("photoUrls[0]"),addPet.getPhotoUrls().get(0));
        Assert.assertEquals((int) response.body().path("tags[0].id"),addPet.getTags().get(0).getId());
        Assert.assertEquals(response.body().path("tags[0].name"),addPet.getTags().get(0).getName());
        Assert.assertEquals(response.body().path("status"),addPet.getStatus());
       
       
        System.out.println(a);
    
        
        
      /* response.body().path("category id").equals(11);
       response.body().path("category name").equals("Bulldog");
        response.body().path("name").equals("mike");
        response.body().path("photourls[0]").equals("www.pet.com/add");
        response.body().path("tags[0].id").equals(11);
        response.body().path("tags[0].name").equals("jade");
        response.body().path("status").equals("available");
   */
   
    }
    
    /*@Given("I have valid URL with only mandatory data")
    public void iHaveValidURLWithOnlyMandatoryData() {
    
    }
    
    @Given("I have valid URL with invalid data")
    public void iHaveValidURLWithInvalidData() {
    
    }
    
    @Then("I validate the unsuccessful response")
    public void iValidateTheUnsuccessfulResponse() {
    }*/
}
