package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGTestListener implements ITestListener{
   
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart Method called");
        
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method called -- "+result.getInstanceName()+"."+result.getName());
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method called");
        
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method called");
        
    }
    
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    
    
    }
    
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    
    
    }
    
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart Method called");
        
    }
    
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("OnFinish Method called");
        
    }
    
}