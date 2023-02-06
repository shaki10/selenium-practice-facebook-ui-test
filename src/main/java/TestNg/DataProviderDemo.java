package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  
    
    @Test(dataProvider =  "create")
            public void test( String username, String password ) {
         
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver");
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("saucedata");
        driver.findElement(By.id("login-button")).click();
        
       
        
      
    }
    @DataProvider(name = "create")
    
    public Object[][] dataSet1() {
        return new Object[][]{
                
                {"standard_user", "saucedata"},
                {"locked_out_user", "mango"},
                {"problem_user", "rain"},
                {"performance_glitch_user", "fall"}
            
        };
    }
}
