package animal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] arg){

        System.setProperty("webdriver.driver.chrome","src/resources/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost300");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//li[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//button[@id='simple-tab-0']")).click();
        driver.findElement(By.name("email")).sendKeys("(shakiahmed10@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Ht32@265364");
        driver.findElement(By.xpath("//button[@type='submit']")).click();




    }
}
