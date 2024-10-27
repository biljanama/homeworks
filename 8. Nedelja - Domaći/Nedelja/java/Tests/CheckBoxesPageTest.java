package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxesPageTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod

    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

    }

    @Test

    public void userCanSuccessfullyClickOnCheckBox() {
        checkBoxesPage.getCheckbox1().clear();
        checkBoxesPage.clickOnCheckBox1();
        checkBoxesPage.getGetCheckbox2().clear();
        checkBoxesPage.clickOnCheckBox2();

        String checked = "checked";


    }


}
