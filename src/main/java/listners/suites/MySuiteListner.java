package listners.suites;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListner implements ISuiteListener {
    
    @Override
    public void onStart(ISuite suite) {
        System.out.println("On suite start....");
    }
    
    @Override
    public void onFinish(ISuite suite) {
        System.out.println("On suite end....");
    }
}
