import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExampleTest {
    @Test
    public void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1,1);
    }
    
    @Test
    @DisplayName("Should check all item in the list")
    public void shouldCheckAllItemInTheList(){
        List<Integer> numbers = List.of(2, 3, 5, 7);
        
      Assertions.assertEquals(2,numbers.get(0));
      Assertions.assertEquals(3,numbers.get(1));
      Assertions.assertEquals(5,numbers.get(2));
      Assertions.assertEquals(7,numbers.get(3));
      
    }
    
}
