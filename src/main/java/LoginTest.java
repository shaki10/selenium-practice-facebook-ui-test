import base.Base;
import org.openqa.selenium.By;

public class LoginTest {
    
    public static void main(String[] args){
     
     Base base = new Base();
       
       base. driver.get("https://www.target.com/");
       base. driver.manage().window().fullscreen();
       base.driver.findElement(By.xpath("//span[@class='styles__AccountName-sc-1kk0q5l-0 iQFCAn']")).click();
       base.driver.findElement(By.id("accountNav-signIn")).click();
       base.driver.findElement(By.id("username")).sendKeys("shaki_haque@yahoo.com");
       base.driver.findElement(By.name("password")).sendKeys("AyDeen@2017");
       
       
    
        try {
            Thread.sleep(3000);
        } catch(Exception exception) {
        }
        }
}





