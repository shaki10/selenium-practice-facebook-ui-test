import base.Base;
import facebook.TargetHomePage;

public class TargetLandingPage {
    
    public static void main(String[] args) {
        
        Base base = new Base();
        base.driver.get("https://www.target.com/");
        base.driver.manage().window().fullscreen();
        
        TargetHomePage targetHomePage = new TargetHomePage(base.driver, base.webDriverWait);
        targetHomePage.createNewTargetAccount();
        
        try {
            Thread.sleep(3000);
        } catch (Exception exception) {
        }
        
    }
    
}

