package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TargetHomePage {
    
    @FindBy(xpath = "//span[@class='styles__AccountName-sc-1kk0q5l-0 iQFCAn']")
    public WebElement singninButton;
    
    @FindBy(xpath = "//*[@id='accountNav-createAccount']")
    public WebElement createAccountButton;
    
    @FindBy(xpath = "//input[@name='usernamecreateaccount']")
    public WebElement emailAddress;
   
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;
    
    @FindBy(xpath = "//input[@name='phonecreateAccount']")
    public WebElement mobilePhoneNumber;
    
    @FindBy(xpath = "//input[@name='passwordcreateaccount']")
    public WebElement createPassword;
    
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    
    public TargetHomePage(WebDriver driver, WebDriverWait webDriverWait){
        this.driver = driver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(driver,this);
    }
    
    public void createNewTargetAccount(){
        singninButton.click();
        
        webDriverWait.until(ExpectedConditions.visibilityOf(createAccountButton));
        
        createAccountButton.click();
        
        webDriverWait.until(ExpectedConditions.visibilityOf(emailAddress));
        emailAddress.sendKeys("hsgdh_gdff@yahoo.com");
        firstName.sendKeys("jhon");
        lastName.sendKeys("dvid");
        mobilePhoneNumber.sendKeys("3457642332");
        createPassword.sendKeys("wueb@sdbh");
        
        createAccountButton.click();
    }
    
    
    
    
    
    
    
}
