package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddRemoveElementsPage extends BaseTest {

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector("button[onclick='addElement']"));
    }

    WebElement addButton;

    public WebElement getDeleteButton() {
        return driver.findElement(By.className("added-manually"));
    }

    WebElement deleteButton;

    public void clickOnAddButton() {
        getAddButton().click();
    }
    public void ClickOnDeleteButton() {
        getDeleteButton().click();
    }




}
