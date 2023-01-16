package TestNg;
import base.Base;
import base.Base1;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookHomePage1 extends Base {

    @Test(dataProvider = "testdata")
    public static void main(String email, String pass) throws InterruptedException {
        System.out.println("Clicked successfully");
        Base base = new Base();
        base.setUp("chromedriver");
        //base.setUp("safari");
        base.driver.get("https://www.facebook.com/");
        base.driver.manage().window().fullscreen();

        base.driver.get("https://www.facebook.com");
        base.driver.findElement(By.name("email")).sendKeys("shaki_haque@yahoo.com");
        base.driver.findElement(By.id("pass")).sendKeys("AyDeen@2017");
        base.driver.findElement(By.name("login")).click();

        @DataProvider(name = "testdata")
        public Object[][] tData() {

            return new Object[][]

                    {"shaki_haque1@yahoo.com", "AyDeen@2011"},
                    {"shaki_haque2@yahoo.com", "AyDeen@2014"},
                    {"shaki_haque3@yahoo.com", "AyDeen@2013"},
                    {"shaki_haque@yahoo.com", "AyDeen@2017"}

            };
        }
    }



        //testHomePage(base.driver);

        //base.setUp("chrome");
        // base.driver.get("https://www.facebook.com/");
        //base.driver.manage().window().fullscreen();
        //base.driver.get("safari");
        //base.driver.get("https://www.facebook.com/");
        //base.driver.manage().window().fullscreen();
        //base.driver.get("https://www.macys.com/");
        //base.driver.manage().window().fullscreen();



    /*public static void testHomePage(WebDriver webDriver){

        WebElement createAccountButton = webDriver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
        createAccountButton.click();
    }*/

    }
}



