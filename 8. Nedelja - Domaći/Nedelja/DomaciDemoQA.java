package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DomaciDemoQA {
    //Koristeci anotacije, ulogujte se na demoqa (https://demoqa.com/ -> Book Store Application) preko cookies-a

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
        Cookie cookie = new Cookie("userID", "932b34ba-4bbb-4e54-96c4-97ac453abf2b");
        Cookie cookie2 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImJtbSIsInBhc3N3b3JkIjoiU3ZlTWVPdm9OZXJ2aXJhMSMiLCJpYXQiOjE3MjgyMjI1MjJ9.1fclSANAEgZGQV-OOljsKfle3PyOJ5xO2deedUo0HDY");
        Cookie cookie3 = new Cookie ("userName", "bmm");
        Cookie cookie4 = new Cookie ("expires", "2024-10-13T13%3A48%3A42.763Z");

        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie2);
        driver.manage().addCookie(cookie3);
        driver.manage().addCookie(cookie4);

        driver.navigate().refresh();

    }

    @Test

    public void test() {
        
    }


}
