package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage extends BaseTest {

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public WebElement getSelectOptionField() {
        return driver.findElement(By.id("dropdown"));
    }

    WebElement selectOptionField;

    public WebElement getOption1Field() {
        return option1Field;
    }

    WebElement option1Field;


    public WebElement getOption2Field() {
        return option2Field;
    }

    WebElement option2Field;

    public void clickOnSelectOptionField() {
        getSelectOptionField().click();
    }
    public void clickOnOption1Field() {
        getOption1Field().click();
    }

    public void clickOnOption2Field() {
        getOption2Field().click();

    }







}
