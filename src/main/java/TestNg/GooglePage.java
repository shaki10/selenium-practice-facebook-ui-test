package TestNg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({TestNGTestListener.class})
public class GooglePage {
    
    @Test(groups = "smoke",successPercentage = 80,timeOut = 60)
    public void test1(){
        System.out.println("test1");
        
    }
    
    @Test(groups = "regression")
    public void test2(){
        System.out.println("test2");
    }
}
