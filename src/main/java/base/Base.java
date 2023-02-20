package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Base {
    
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    
    
    //@BeforeClass
   // @BeforeTest
    public Base() {
        String driverName;
        setUp("chrome");
        
    }
    public void setUp(String driverName) {
    
        String driverPath = "src/main/resources/Driver/{driverName}";
        String driverKey = "webdriver.".concat(driverName).concat(".driver");
        // e.g. system property name for chrome webdriver is webdriver.chrome.driver
    
        if (driverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver");
            driver = new ChromeDriver();
        } else if (driverName.equals("gecko")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/Driver/geckodriver");
            driver = new FirefoxDriver();
        } else if (driverName.equals("safari")) {
            driver = new SafariDriver();
        }
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    
    public void driver(String s) {
    
    }
}