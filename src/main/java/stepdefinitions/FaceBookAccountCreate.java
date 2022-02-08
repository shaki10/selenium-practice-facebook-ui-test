package stepdefinitions;

import base.Base;
import facebook.FacebookHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
/*
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FaceBookAccountCreate extends Base {
    
    WebDriver driver;
    WebDriverWait wait;
    
    FacebookHomePage facebookHomePage = new FacebookHomePage(driver,webDriverWait);
    
    @Given("^I am in facebook home page for signup")
    public void iAmInFacebookHomePageForSignup() {
        driver.get("https://www.facebook.com");
        
    }
   
    
    @When("^I click on creat account button")
    public void iClickOnCreatAccountButton() {
        facebookHomePage.createAccountButton.click();
    
    }
    
    
    @Then("^I am able to see sign up form")
    public void iAmAbleToSeeSignUpForm() {
        wait.until(ExpectedConditions.visibilityOf(facebookHomePage.signupPopUpButton));
        Assert.assertEquals(facebookHomePage.signupPopUpButton.getText(),"Sign Up");
        
    
    }
    
    @When("^I fill up form with firstName(.*), lastName(.*), email(.*) and age(.*)$")
    public void iFillUpFormWithFirstNameFirstNameLastNameLastNameEmailEmailAndAgeAge(String firstName, String lastName, String email,String age) {
        facebookHomePage.firstName.sendKeys(firstName);
        facebookHomePage.lastname.sendKeys(lastName);
       
    }
    
*/




import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class FaceBookAccountCreate {
    
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
        
        List<List<String>> dataList = dataTable.asLists();
        dataList.get(0);
        dataList.get(1);
        dataList.get(2);
       
    
        /*List<Map<String,String>> dataAsMap = dataTable.asMaps(String.class,String.class);
        for(Map<String,String> data : dataAsMap){
            System.out.println("Record::" + data.get("email")+" --- "+data.get("password"));
        }*/
    }
    
    @When("I enter data")
    public void doSomething(DataTable dataTable){
        List<Map<String,String>> listOfMaps = dataTable.asMaps();
        listOfMaps.get(0);
        listOfMaps.get(1);
        listOfMaps.get(2);
    }
    
    @Then("I click on sign in button")
    public void iClickOnSignInButton() {
        System.out.println("I am inside iClickOnSignInButton()....");
    }
}




