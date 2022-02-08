package runner.api.petstore.pet;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = "src/main/resources/features/api/petstore/CreatePetWithList.feature",
        glue = "stepsdefs.api.petstore.pet",
        tags = "@petwithlist")

public class PetWithListTest {
}
