package Indeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndeedPage {
    
    
    
    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement signIn;
    
    
    @FindBy(id = "account_name_text_field" )
    public WebElement accountNameTextField;
    
    @FindBy(xpath = "//button[@id='sign-in']")
    public WebElement nameSignInButton;
    
    @FindBy(xpath = "//input[@id='password_text_field']")
    public WebElement passwordTextField;
    
    @FindBy(xpath = "//button[@id='sign-in']")
    public WebElement passwordClickButton;
    
    public WebDriver driver;
    public WebDriverWait wait;
    
    
    public IndeedPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
    
    public void clicksignIn() {
        signIn.click();
    
        WebElement appleSignInButton = driver.findElement(By.xpath("//span[text()='Continue with Apple']"));
        appleSignInButton.click();
    
        driver.getWindowHandle();//parent window
        driver.getWindowHandles();// child windows
    
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(driver.getWindowHandle())) {
                driver.switchTo().window(window);
                accountNameTextField.sendKeys("aaa@bb.com");
                nameSignInButton.click();
                
                //driver.findElement(By.id("account_name_text_field")).sendKeys("aa@bb.com");
                //driver.findElement(By.xpath("//button[@id='sign-in']")).click();
    
                wait.until(ExpectedConditions.visibilityOf(passwordTextField));
                passwordTextField.sendKeys("xasxaxax");
                wait.until(ExpectedConditions.visibilityOf(nameSignInButton));
                nameSignInButton.click();
                //passwordClickButton.click();
                
            }
        }
    }
}













