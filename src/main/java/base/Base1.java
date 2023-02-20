package base;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base1 {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    public Base1(String driverName) {
        setUp(driverName);
    }


    public void setUp(String driverName) {

        if (driverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver");
            driver = new ChromeDriver();
        } else if (driverName.equals("gecko")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/Driver/geckodriver");
            driver = new FirefoxDriver();
        } else if (driverName.equals("safari")) {
            driver = new SafariDriver();
        }
    }
}


   
 
    
