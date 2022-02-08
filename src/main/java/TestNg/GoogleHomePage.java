package TestNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Base64;

public class GoogleHomePage{
    
        public static WebDriver driver;
        public static WebDriverWait wait;
        
        
       @BeforeTest
        public void setUp() {
            System.out.print("2");
            String driverName = "chrome";
            String driverPath = "src/main/resources/Driver/chromedriver";
            String driverKey = "webdriver.".concat(driverName).concat(".driver");
            
            System.setProperty(driverKey, driverPath);
            driver = new ChromeDriver();
            
            // wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
            
        }
        
        @DataProvider(name = "googleData")
        public Object[][] createGooleTestData(){
            return new Object[][] {{"muffin@gmail.com","m00njdfh"},{"kelly@gmail.com","Gusdh23"}};
            
        }
        
       @Test(dataProvider = "googleData",groups = {"smoke"})
        public void testGoogleHomePage(String[] data){
            driver.get("https://www.google.com");
            driver.findElement(By.xpath("//a[text()='Sign in']")).click();
            driver.findElement(By.id("email")).sendKeys(data[0]);
            driver.findElement(By.id("password")).sendKeys(data[1]);
            
        }
        
        //@Test
        @Test(priority = 1, successPercentage = 90, groups = {"regression"})
        //@Test(groups ="googletest")
        
        public void googleSearch() {
            driver.get("https://www.google.com");
            driver.findElement(By.name("q")).sendKeys("Automation steps by Steps");
            driver.findElement(By.name("btnK")).click();
            
            driver.close();
            driver.quit();
            System.out.println("Test Complete Successfully");
            
        }
        @Test(priority = 2, groups= {"smoke"})
        //@Test(groups = "googletest")
        public void targetHomePage() {
            driver.get("https://www.target.com");
            driver.findElement(By.id("search")).sendKeys("christmas gift idea");
            
            driver.close();
            driver.quit();
            System.out.println("Do some more test");
        }
        //@Test(dependsOnMethods = "testgooglePage", dependsOnGroups = "googletest")
        @Test(dependsOnMethods = "testgooglePage", dependsOnGroups = "googletest", alwaysRun = true, priority = 3)
        public void facebookLogIn() {
            driver.get("https://www.facebook.com");
            driver.findElement(By.name("email")).sendKeys("shaki_haque@yahoo.com");
            driver.findElement(By.id("pass")).sendKeys("jahsdj@2017");
            driver.findElement(By.name("login")).click();
        }
        
    }
    

