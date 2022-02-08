import base.Base;
import facebook.InstagramHomePage;

public class InstagramLandingPage {
    
    public static void main (String args[]) {
        Base base = new Base();
        base.driver.get("https://www.instagram.com/");
        InstagramHomePage instagramHomePage = new InstagramHomePage(base.driver,base.webDriverWait);
        instagramHomePage.createNewInstagramAccount();
        try {
            Thread.sleep(30000);
        }catch (Exception e){
        
        
        
        }
    
    }
}
