package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class McdonalHomePage {
    @FindBy(css = ".desktop-nav .mcdeliveryOrder")
    public WebElement orderNow;
    
    @FindBy(id = "order-now-cancel")
    public WebElement cancelOrder;
    
    WebDriverWait wait;
    WebDriver driver;
    
    public McdonalHomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
    
    public void openOrderpopup() {
        
        orderNow.click();
        cancelOrder.click();
        
    }
}



