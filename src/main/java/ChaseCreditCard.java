import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChaseCreditCard {
    WebDriver driver = new ChromeDriver();

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.chase.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@data-id='product-2']")).click();


    }

    public static Object creatFacebookAccount;


        @FindBy(xpath = "//a[text()='Apply as a guest'][@data-pt-name='cc_freedom_ulim_pp_apply1']")
        public WebElement ApplyAsGuestButton;

        @FindBy(xpath = "//input[@name='firstName']")
        public WebElement firstName;

        @FindBy(xpath = "//input[@name='middleName']")
        public WebElement middleName;

        @FindBy(xpath = "//input[@name='lastName']")
        public WebElement lastName;

        @FindBy(xpath = "//select[@name='suffixId']")
        public WebElement suffixId;

        @FindBy(xpath = "//input[@id='dateOfBirth-text-validate-input-field']")
        public WebElement dateOfBirth;

        @FindBy(xpath = "//input[@id='mothersMaidenName-text-validate-input-field']")
        public WebElement motherMaidenName;

        @FindBy(xpath = "//select[@id='select-taxIdType-select-validate']")
        public WebElement taxIdType;

        @FindBy(xpath = "//input[@class='jpui input validation__error']")
        public WebElement socialSecurityNumber;

        @FindBy(xpath = "//select[@name='addressCategoryId']")
        public WebElement adressType;

        @FindBy(xpath = "//input[@name='streetAddress']")
        public WebElement streetAddress;

        @FindBy(xpath = "//input[@name='apartmentNumber']")
        public WebElement apartmentNumber;

        @FindBy(xpath = "//input[@name='zipCode']")
        public WebElement zipCode;

        @FindBy(xpath = "//input[@name='cityId']")
        public WebElement cityId;

        @FindBy(xpath = "//select[@name='stateId']")
        public WebElement stateId;

        @FindBy(xpath = "//input[@id='emailAddressId-text-validate-input-field']")
        public WebElement emailAddreddId;

        @FindBy(xpath = "//input[@id='phoneNumberId-text-validate-input-field']")
        public WebElement phoneNumberId;

        @FindBy(xpath = "//input[@aria-label='Error: Check this box to provide your electronic signature for the authorization above.']")
        public WebElement checkThisBox;

        @FindBy(xpath = "//select[@id='select-residenceOwnership-select-validate']")
        public WebElement residenceType;

        @FindBy(xpath = "//select[@id='select-primaryIncomeSourceName-select-validate']")
        public WebElement sourceOfIncome;

        @FindBy(id = "blx-nameBlock-firstName-text-validate-input-field")
        public WebElement incomeType;

        @FindBy(name = "grossAnnualIncome")
        public WebElement getGrossAnnualIncome;

        @FindBy(id = "paperlessStatements-radio-1")
        public WebElement paperLessStatements;

        @FindBy(id = "accessible-authorizedUsersHeader-radio-0")
        public WebElement authorizedUsers;

        @FindBy(id = "accessible-balanceTransfer-radio-0")
        public WebElement balanceTransfer;

        @FindBy(name = "navigationAdvisoryCheckbox")
        public WebElement agreementButton;

        @FindBy(xpath = "//mds-button[@id='SUBMIT-nav-ctr-btn']")
        public WebElement submitButton;


        public WebDriver driver1;
        public WebDriverWait webDriverWait;
     
     public ChaseCreditCard(WebDriver driver, WebDriverWait webDriverWait) {
            this.driver = driver;
            this.webDriverWait = webDriverWait;
            PageFactory.initElements(driver, this);

        }

     
     public void createNewChasefreedomunlimitedcreditCardAccount(){
         
         ApplyAsGuestButton.click();
         
         firstName.sendKeys("Connie");
         middleName.sendKeys("Aria");
         lastName.sendKeys("Lester");
         suffixId.click();
         dateOfBirth.sendKeys("12/12/1978");
         motherMaidenName.sendKeys("Jessica");
         taxIdType.sendKeys("Socialsecuritynumber");
         socialSecurityNumber.sendKeys("876907865");
         adressType.click();
         streetAddress.sendKeys("1231 Madison Avenue");
         apartmentNumber.sendKeys("4p");
         zipCode.sendKeys("10023");
         cityId.sendKeys("NewYork");
         stateId.sendKeys("NY");
         emailAddreddId.sendKeys("peter23@gmail.com");
         phoneNumberId.sendKeys("2652346767");
         checkThisBox.click();
         residenceType.click();
         sourceOfIncome.click();
         incomeType.click();
         getGrossAnnualIncome.sendKeys("70000");
         paperLessStatements.click();
         authorizedUsers.click();
         balanceTransfer.click();
         
         //webDriverWait.until(ExpectedConditions.visibilityOf(firstName));
     
    }
}

