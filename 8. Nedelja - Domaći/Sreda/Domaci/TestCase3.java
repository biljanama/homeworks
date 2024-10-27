package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {

        // 3. TC User can log out
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        String validUsername = "standard_user";
        String validPassword = "secret_sauce";

        usernameField.clear();
        usernameField.sendKeys(validUsername);
        passwordField.clear();
        passwordField.sendKeys(validPassword);
        loginButton.click();

        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();

        WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
        Thread.sleep(5000);
        logoutLink.click();

        String expectedLink = "https://www.saucedemo.com/";
        String actualLink  = driver.getCurrentUrl();

        Assert.assertEquals(actualLink,expectedLink);

        WebElement loginLogo = driver.findElement(By.className("login_logo"));
        Assert.assertEquals(loginLogo.getText(), "Swag Labs");

    }
}
