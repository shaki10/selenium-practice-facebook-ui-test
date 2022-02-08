package runner.api.petstore.pet;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/main/resources/features/api/petstore/UpdatePet.feature",
        glue = "stepsdefs.api.petstore.pet",
        tags = "@updatepet")


public class UpdatePetTest {
}
