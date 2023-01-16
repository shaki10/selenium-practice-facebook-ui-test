package Junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Instant;


public class gitFacebookJunit {
    
    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @BeforeAll
    public static void setUp() {
        
        System.out.print("1");
        
        String driverName = "chrome";
        String driverPath = "src/main/resources/Driver/chromedriver";
        String driverKey = "webdriver.".concat(driverName).concat(".driver");
        
        System.setProperty(driverKey, driverPath);
        driver = new ChromeDriver();
        
        System.out.print("2");
        // wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }
    
    @Test
    public void facebookLogIn() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("shaki_haque@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("jahsdj@2017");
        driver.findElement(By.name("login")).click();
    }
}




