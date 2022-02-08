package stepsdefs.facebook;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class FacebookSteps {
    
    //FacebookHomePage facebookHomePage = new FacebookHomePage(driver,webDriverWait);
    
    @Given("I am in facebook home page")
    public void IAmInFacebookHomePage() {
        //driver.get("https://www.facebook.com");
        System.out.println("I am in IAmInFacebookHomePage()...");
    }
    
   // @When("I enter credentials")
   // public void iEnterCredentials(DataTable dataTable) {
   
   // @When("^I enter credentials")
            public void iEnterEmailAndPassword( DataTable dataTable){
        
       /* List<List<String>> dataList = dataTable.asLists();
        dataList.get(0);
        dataList.get(1);
        dataList.get(2);
       */
    
        /*List<Map<String,String>> dataAsMap = dataTable.asMaps(String.class,String.class);
        for(Map<String,String> data : dataAsMap){
            System.out.println("Record::" + data.get("email")+" --- "+data.get("password"));
        }*/
    }
    
    @When("I enter data")
    public void doSomething(DataTable dataTable){
        List<Map<String,String>> listOfMaps = dataTable.asMaps();
        listOfMaps.get(0);
        listOfMaps.get(0);
        listOfMaps.get(0);
    }
    
    @Then("I click on sign in button")
    public void iClickOnSignInButton() {
        System.out.println("I am inside iClickOnSignInButton()....");
    }
}



