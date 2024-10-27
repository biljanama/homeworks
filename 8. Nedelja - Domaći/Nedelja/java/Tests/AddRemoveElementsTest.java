package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod

    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

    }

    @Test

    public void userCanAddElement() {
        addRemoveElementsPage.clickOnAddButton();
    }

    public void userCanDeleteElement() {
        addRemoveElementsPage.ClickOnDeleteButton();
    }


}
