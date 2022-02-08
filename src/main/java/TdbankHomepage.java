import base.Base;

public class TdbankHomepage {
    
        
        public static void main(String[] args) {
            Base base = new Base();
            base.setUp("firefox");
            base.driver.get("https://www.td.com/us/en/personal-banking/");
            base.driver.manage().window().minimize();
            
            try {
                Thread.sleep(2000);
            } catch (Exception exception) {
            
            }
        }
    }
    

