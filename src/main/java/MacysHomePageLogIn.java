import base.Base;
import org.openqa.selenium.By;

public class MacysHomePageLogIn extends Base {
    
    
    public static void main(String args[]) {
        Base base = new Base();
        base.setUp("chromedriver");
        //base.setUp("safari");
        base.driver.get("https://www.macys.com/");
        base.driver.manage().window().fullscreen();
        
        base.driver.get("https://www.macys.com/");
        base.driver.findElement(By.id("myRewardsLabel"));
        base.driver.findElement(By.id("email")).sendKeys("shaki_haque@yahoo.com");
        base.driver.findElement(By.id("pw-input")).sendKeys("AyDeen@2017");
        base.driver.findElement(By.name("login")).click();
        
    }
}
