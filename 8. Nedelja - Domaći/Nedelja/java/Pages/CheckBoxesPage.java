package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxesPage extends BaseTest {

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public WebElement getCheckbox1() {
        return driver.findElement(By.cssSelector(".checkboxes> type:nth - child(1)"));
    }

    WebElement checkbox1;

    public WebElement getGetCheckbox2() {
        return driver.findElement(By.cssSelector(".checkboxes> type:nth - child(2)"));
    }

    WebElement getCheckbox2;

    public void clickOnCheckBox1() {
        getCheckbox1().click();

    }

    public void clickOnCheckBox2() {
        getCheckbox2.click();
    }



}
