import base.Base;
import org.junit.jupiter.api.Test;

public class ChaseCreditCardAccount {
    
    @Test
    public void openCreditCard(){
    
    Base base = new Base();
    base.driver.get("https://creditcards.chase.com/cash-back-credit-cards/freedom/unlimited");
    
    ChaseCreditCard chaseCreditCard = new ChaseCreditCard(base.driver, base.webDriverWait);
    chaseCreditCard.createNewChasefreedomunlimitedcreditCardAccount();
    }
}
