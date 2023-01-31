package runner.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class FacebookLogIn {
    public static WebDriver driver;
    public static WebDriverWait wait;


    WebDriver d = new ChromeDriver();

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/Driver/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.manage().window().fullscreen();
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shaki_haque@yahoo.com");
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("AyDeen@2017");
            driver.findElement(By.xpath("//button[@name='login']")).click();


        }


    }

