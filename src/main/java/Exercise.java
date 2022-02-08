import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exercise {

    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @BeforeAll
    
    
    public void setUp() {
        String driverName = "chromedriver";
        String driverPath = "src/main/resources/Driver/chromedriver";
        String driverKey = "WebDriver.".concat(driverName).concat(".driver");
    
        if (driverName.equals("chrome")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "chromedriver"));
            driver = new ChromeDriver();
        } else if (driverName.equals("gecko")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "geckodriver"));
            driver = new FirefoxDriver();
        } else if (driverName.equals("safari")) {
            System.setProperty(driverKey, driverPath.replace("{safari}", "Safaridriver"));
            driver = new SafariDriver();
        }
    
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }
    @AfterAll
    public void close(){
        driver.close();
    }
        
        }
        
        
        
    

