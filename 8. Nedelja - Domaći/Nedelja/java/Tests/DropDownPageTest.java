package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownPageTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod

    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

    }

    @Test
    public void userCanClickOnOptionMenu() {
        dropdownPage.clickOnSelectOptionField();
    }
}
