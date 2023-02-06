package facebook;

/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignUpPage {
    WebDriver driver = new ChromeDriver();


        public void setUp() {
            String driverName = "chromedriver";
            String driverPath = "src/main/resources/Driver/chromedriver";
            String driverKey = "WebDriver.".concat(driverName).concat(".driver");


        System.setProperty("https://www.facebook.com");
        driver.manage().window().fullscreen();

        driver.findElement (By.xpath(  "//a[@data-testid ='open-registration-form-button']"));
        driver.findElement()

*/


import base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookHomePage1 {
    public static Object creatNewFacebookAccount;
    WebDriver driver = new ChromeDriver();
   // public static void main(String[]args){


    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//div[text()='Sign Up']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='reg_email__']")
    public  WebElement mobileOrEmail;

    @FindBy(name="reg_email_confirmation__")
    public WebElement reEnterEmail;

    @FindBy(xpath = "//input[@name='reg_passwd__']")
    public WebElement passWord;
    @FindBy(xpath = "//select[@name='birthday_month']")
    public WebElement birthMonth;
    @FindBy(xpath = "//select[@name='birthday_day']")
    public WebElement birthDay;
    @FindBy (xpath = "//select[@name='birthday_year']")
    public WebElement birthYear;

    @FindBy(xpath = "//input[@id ='u_2_4_be']")
    public WebElement genderFemale;

    @FindBy(xpath= "//input[@id ='u_2_5_vk']")
    public WebElement genderMale;

    @FindBy (xpath = "//input[@id ='u_2_6_1f']")
    public WebElement genderCustom;
    @FindBy(xpath = "//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")
    public  WebElement submitButton;


    public WebDriverWait webDriverWait;

    public FacebookHomePage1(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(driver, this);

    }

    public void createNewFacebookAccount(){

        driver.findElement(By.id("u_0_2_wu")).click();
        createAccountButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOf(firstName));

        firstName.sendKeys("david");
        lastname.sendKeys("fox");
        mobileOrEmail.sendKeys("shdg_main@yahoo.com");

        webDriverWait.until(ExpectedConditions.visibilityOf(reEnterEmail));
        reEnterEmail.sendKeys("shdg_main@yahoo.com");


        WebElement password = null;
        password.sendKeys("1qaz@2wsX");
        birthYear.sendKeys("1993");
        birthMonth.sendKeys("Jan");
        birthDay.sendKeys("11");
        genderFemale.click();

        submitButton.click();

    }
    }














