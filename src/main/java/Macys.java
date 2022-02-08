import base.Base;

public class Macys {
    
        
        public  static void main(String[]args){
            Base base = new Base();
            base.setUp("gecko");
            base.driver.get("https://www.macys.com/");
            base.driver.manage().window().fullscreen();
            base.driver.manage().window().minimize();
            base.driver.close();
            try {
                Thread.sleep(30000);
            }catch (Exception e){
        
            }
            
        }
        
    }

