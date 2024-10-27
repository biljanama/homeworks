package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase2 {
    public static void main(String[] args) {

        //2. TC User cant log in with invalid username


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.saucedemo.com/");
        String invalidUsername1 = "problem_use";
        String validPassword = "secret_sauce";

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));


        usernameField.clear();
        usernameField.sendKeys(invalidUsername1);
        passwordField.clear();
        passwordField.sendKeys(validPassword);
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("error-message-container error"));
        //String error = "Username and password do not match any user in this service";

        Assert.assertEquals(errorMessage.getText(), "Username and password do not match any user in this service");


    }
}
