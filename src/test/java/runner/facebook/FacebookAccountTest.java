package runner.facebook;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(


      
                    features = "src/main/resources/features/facebook/createFacebookAccount.feature",
                    glue = "stepsdefs.api.facebookSteps.facebook",
                    tags = "@MyTag")


    public class FacebookAccountTest {
    
    

}

