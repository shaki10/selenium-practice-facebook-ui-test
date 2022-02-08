import base.Base;

public class MacysHomePage {
    
    public static void main(String[] args) {
        Base base = new Base();
        base.setUp("chrome");
        base.driver.get("https://www.macys.com/");
        base.driver.manage().window().fullscreen();
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
    
        }
        
        
    }
    
    public static class AmazonHomePage {
    
    
        public static void main(String[] args) {
            Base base = new Base();
            base.setUp("safari");
            base.driver.get("https://www.amazon.com/");
            base.driver.manage().window().maximize();
        
            try {
                Thread.sleep(3000);
            
            } catch (Exception exception) {
            
            }
        
        }
    }
}





