package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookHomePage {
    public static Object creatNewFacebookAccount;
    
    @FindBy (xpath ="//a[@data-testid='open-registration-form-button']")
    public WebElement createAccountButton;
    
    @FindBy(xpath = "//div[text()='Sign Up']")
    public WebElement signupPopUpButton;
    
    @FindBy(name ="firstname")
    public WebElement firstName;
    
    @FindBy(name="lastname")
    public WebElement lastname;
    
    @FindBy(name="reg_email__")
    public WebElement mobileOrEmail;
    
    @FindBy(name="reg_email_confirmation__")
    public WebElement reEnterEmail;
    
    @FindBy(xpath = "//input[@type='password'][@name='reg_passwd__']")
    public WebElement password;
    
    @FindBy(name="birthday_month")
    public WebElement birthMonth;
    
    @FindBy(name="birthday_day")
    public WebElement birthDay;
    
    @FindBy(name="birthday_year")
    public WebElement birthYear;
    
    @FindBy(xpath = "//input[@type='radio'][@name='sex'][@value='2']")
    public WebElement genderMale;
    
    @FindBy(xpath = "//input[@type='radio'][@name='sex'][@value='1']")
    public WebElement genderFemale;
    
    @FindBy(xpath = "//input[@type='radio'][@name='sex'][@value='-1']")
    public WebElement genderCustom;
    
    @FindBy(xpath = "//button[@type='submit'][@name='websubmit']")
    public WebElement submitButton;
    
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    
    public FacebookHomePage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(driver, this);
    }
    
    public void createNewFacebookAccount(){
        //driver.findElement(By.id("u_0_2_wu")).click();
        createAccountButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(firstName));
        
        firstName.sendKeys("david");
        lastname.sendKeys("fox");
        mobileOrEmail.sendKeys("shdg_main@yahoo.com");
        
        webDriverWait.until(ExpectedConditions.visibilityOf(reEnterEmail));
        reEnterEmail.sendKeys("shdg_main@yahoo.com");
        
        password.sendKeys("1qaz@2wsX");
        birthYear.sendKeys("1993");
        birthMonth.sendKeys("Jan");
        birthDay.sendKeys("11");
        genderFemale.click();
        
        submitButton.click();
        
    }
    


}
