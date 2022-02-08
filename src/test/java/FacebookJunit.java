
import com.beust.jcommander.Strings;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FacebookJunit {
    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @BeforeAll
    public static void browser(){
        System.setProperty("webdriver chrome driver","src/main/resources/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @DisplayName("open account method")
    // @ParameterizedTest
    //@CsvSource({'Sophia, Fernandaz', 'sophia45@gamil.com','sophia45@gamil.com', 'sophia@230'})
   // @ValueSource(strings ={"Sophia, Fernandaz", "sophia45@gamil.com", "sophia@230"});
    @Test
    public void test1(){
    
    
    }
    public static void main(String[] data) throws InterruptedException {
    
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(data[0])));
        
        driver.findElement(By.name("firstname")).sendKeys(data);
        driver.findElement(By.name("lastname")).sendKeys(data);
        driver.findElement(By.name("reg_email__")).sendKeys(data);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(data);
        driver.findElement(By.id("password_step_input")).sendKeys(data);
        
    
       
        
            Select selectMonth = new Select(driver.findElement(By.id("month")));
            selectMonth.selectByIndex(1);
        
            Select selectDay = new Select(driver.findElement(By.id("day")));
            selectDay.selectByIndex(4);
        
            Select selectYear = new Select(driver.findElement(By.id("year")));
            selectYear.selectByIndex(8);
        }
        
        @Test
            public void testrun2(){
            
            driver.findElement(By.xpath("//label[text()='Custom']")).click();
            
            Select selectOption = new Select(driver.findElement(By.name("preferred_pronoun")));
            selectOption.selectByIndex(2);
            
            driver.findElement(By.name("custom_gender")).sendKeys("no gender");
            
            driver.findElement(By.name("websubmit")).click();
            
            
            
            
            }
        
        
        
        
        }
        
       
    
        
        
    
    
    
    


