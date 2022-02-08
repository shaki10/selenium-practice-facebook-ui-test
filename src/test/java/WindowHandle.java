import Indeed.IndeedPage;
import base.Base;


public class WindowHandle extends Base {
    
    
    public WindowHandle(String webDriverName) {
        super();
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Base windowHandle = new WindowHandle("chrome");
        
        windowHandle.driver.get("https://www.indeed.com/");
        //windowHandle.driver.manage().window().fullscreen();
        //windowHandle.driver.wait();
        
        IndeedPage indeedPage = new IndeedPage(windowHandle.driver, windowHandle.webDriverWait);
        
        indeedPage.clicksignIn();
        
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
        
        }
    }
}

