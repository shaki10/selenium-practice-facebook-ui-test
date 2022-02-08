package runner.facebook;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke")

public class FacebookAccountTest {
    
    @RunWith(Cucumber.class)
    @CucumberOptions(
      
                    features = "src/main/resources/features/facebook.feature",
                    glue = "stepsdefs",
                    tags = "@Smoke")
            
    
    
    
    
    public static class Test {
    }
}

