package TestNg;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class MyFirstTestFW extends Base {
@BeforeTest
    public static void loginTest(String[] args){
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.target.com");

         driver.findElement(By.xpath("//span[@class='styles__LinkText-sc-u2k6h-3 kzpXPc h-margin-r-x3']")).click();
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shaki_haque@yahoo.com");
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shaki84");
         driver.findElement(By.xpath("//button[@type='submit']")).click();




    }
}
