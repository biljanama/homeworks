package Tests;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test

    public void userCanLogInWithValidEMail() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Text Box");
        textBoxFormPage.fillTheCorrectBoxForm();
        Assert.assertTrue(textBoxFormPage.getOutbox().isDisplayed());

    }

    @Test

    public void userCannotLogInWithInvalidEMail() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Text Box");
        textBoxFormPage.inputUsername("biljana");
        textBoxFormPage.getEmailField().sendKeys("mail@mail");
        js.executeScript("window.scrollBy(0,500)", "");
        textBoxFormPage.clickOnSubmitButton();
        Assert.assertFalse(textBoxFormPage.getOutbox().isDisplayed());


    }
}
