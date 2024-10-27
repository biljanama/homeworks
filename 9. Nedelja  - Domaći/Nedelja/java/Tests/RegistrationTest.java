package Tests;


import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }


    @Test

    public void userCanRegister() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        homepagePage.clickOnCard("Forms");
        sidebarPage.clickOnTextField("Practice Form");
        practiceFormPage.inputFirstName("Biljana");
        practiceFormPage.inputLastName("Biljanic");
        practiceFormPage.inputEmailAdsress("biljana@biljana.com");
        js.executeScript("window.scrollBy(0,350)", "");
        practiceFormPage.clickOnGenderLabel("Female");
        practiceFormPage.inputMobileNo("0641234567");
        practiceFormPage.inputMobileNo("0641234567");
    }

}
