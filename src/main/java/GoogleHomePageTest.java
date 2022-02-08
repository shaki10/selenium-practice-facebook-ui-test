import org.testng.annotations.Test;

public class GoogleHomePageTest extends Exercise{
    
    
    
    
    @Test(enabled = false,alwaysRun = true)
    public void googleHmePageTest(){
        driver.get("https://www.google.com");
    }
    
    
    @Test(dependsOnMethods = "googleHmePageTest")
    public void testGoogleLogin(){
    
    }
    
    @Test(dependsOnMethods = "googleHmePageTest", alwaysRun = true )
    public void testGoogleLoginPage(){
    
    
    }

    
    @Test(groups = "googleTest")
    public void googleHmePageStatus(){
        driver.get("https://www.google.com");
    }
    
    
    @Test(groups = "googleTest")
    public void testGoogleLoginpass(){
    
    }
    
    @Test(dependsOnMethods = "googleHmePageStatus", dependsOnGroups ="googleTest" )
    public void testGoogleLoginPageValid(){
    
    
    }
}
