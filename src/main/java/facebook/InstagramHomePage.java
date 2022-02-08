package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramHomePage {
    
    public static Object creatNewInstagramAccount;
    
    @FindBy(xpath = "//a[@data-testid='sign-up-link']") //"//a[@href='/accounts/emailsignup/']"
    public WebElement createAccountButton;
    
    @FindBy(xpath = "//input[@aria-label='Mobile Number or Email']")
    public WebElement MobileNumberorEmail;
    
    @FindBy(xpath = "//input[@aria-label='Full Name']")
    public WebElement fullName;
    
    @FindBy(xpath = "//input[@aria-label='Username']")
    public WebElement Username;
    
    @FindBy(xpath = "//input[@aria-label='Password']")
    public WebElement password;
    
    
    @FindBy(xpath = "//*[@id='react-root']/section/main/div/div/div[1]/div/form/div[7]/div/button")
    public WebElement submitButton;
    
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    
    public InstagramHomePage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(driver, this);
    }
    
    public void createNewInstagramAccount() {

        webDriverWait.until(ExpectedConditions.visibilityOf(createAccountButton));
        createAccountButton.click();
        
        webDriverWait.until(ExpectedConditions.visibilityOf(MobileNumberorEmail));
        MobileNumberorEmail.sendKeys("shaki_haque@yahoo.com");
        
        fullName.sendKeys("Shakila Ahmed");
        Username.sendKeys("shaki23");
        
        password.sendKeys("1qaz@2wsX");
        
        submitButton.click();
        
    }
    
    
}


