import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    static WebDriver driver;
    public static void main(String args[]) {
        
        System.out.println(System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("shaki_haque@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("AyDeen@2017");
        driver.findElement(By.name("login")).click();
        
        
    }
}
