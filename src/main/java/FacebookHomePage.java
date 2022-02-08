import base.Base1;
import org.openqa.selenium.By;

public class FacebookHomePage {
    
    
    public static void main(String args[]) {
        Base1 base = new Base1("chrome");
        //base.setUp("safari");
        base.driver.get("https://www.facebook.com/");
        base.driver.manage().window().fullscreen();
       
        base.driver.get("https://www.facebook.com");
        base.driver.findElement(By.name("email")).sendKeys("shaki_haque@yahoo.com");
        base.driver.findElement(By.id("pass")).sendKeys("AyDeen@2017");
        base.driver.findElement(By.name("login")).click();
        
        
        
        //testHomePage(base.driver);
        
        //base.setUp("chrome");
        // base.driver.get("https://www.facebook.com/");
        //base.driver.manage().window().fullscreen();
        //base.driver.get("safari");
        //base.driver.get("https://www.facebook.com/");
        //base.driver.manage().window().fullscreen();
        //base.driver.get("https://www.macys.com/");
        //base.driver.manage().window().fullscreen();
        
   
    
    /*public static void testHomePage(WebDriver webDriver){
    
        WebElement createAccountButton = webDriver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
        createAccountButton.click();
    }*/
    
    }
}