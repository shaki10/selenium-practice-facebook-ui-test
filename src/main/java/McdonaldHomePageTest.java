import base.Base;
import facebook.McdonalHomePage;

public class McdonaldHomePageTest {
    
    public static void main(String[] args) throws InterruptedException{
        Base base=new Base();
        base.setUp("firefox");
        base.driver.get("https://www.mcdonalds.com/us/en-us/mcdelivery.html");
        base.driver.manage().window().minimize();
    
        McdonalHomePage mcdonalHomePage = new McdonalHomePage(base.driver, base.webDriverWait);
        mcdonalHomePage.openOrderpopup();
    
    
        try {
            Thread.sleep(6000);
        } catch (Exception exception) {
        
        }
        
    }
}
