import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcepts {

    
    
    
    public static void main(String[] args) throws InterruptedException {
        Base base = new Base();
    
        System.setProperty("webdriver.driver.chrome","src/resources/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
       base. driver.get("https://www.yahoo.com");
        base.driver.findElement(By.id("login-username")).sendKeys("shaki_haque23@yahoo.com");
        base.driver.findElement(By.id("login-signin")).click();
        base.driver.findElement(By.id("login-passwd")).sendKeys("sgahgd@2017");
        base.driver.findElement(By.id("login-signin")).click();
        base.driver.manage().window().fullscreen();
        Thread.sleep(3000);
        
    }
}
