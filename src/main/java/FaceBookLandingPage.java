import base.Base;
import facebook.FacebookHomePage;


import org.junit.jupiter.api.Test;

public class FaceBookLandingPage {
    @Test
  
    public  void test() {
        
        Base base = new Base();
        base.driver.get("https://www.facebook.com/");
        //base.driver.manage().window().;
    
        FacebookHomePage facebookHomePage = new FacebookHomePage(base.driver, base.webDriverWait);
        facebookHomePage.createNewFacebookAccount();
        
        try {
            Thread.sleep(30000);
        }catch (Exception e){
        
        }
        finally {
            System.out.println("I am the best");
        }
        
    }
    
    
}
