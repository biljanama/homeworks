package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxFormPage {

    public TextBoxFormPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;


    public WebElement getFirstNameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAddressField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutbox() {
        return driver.findElement(By.id("output"));
    }



    public void inputUsername(String username) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(username);
    }

    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }

    public void fillTheCorrectBoxForm() {
        inputUsername("biljana");
        inputEmail("biljana@gmail.com");
        getAddressField().sendKeys("BMP");
        getPermanentAddressField().sendKeys("NG");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        clickOnSubmitButton();

    }








}
