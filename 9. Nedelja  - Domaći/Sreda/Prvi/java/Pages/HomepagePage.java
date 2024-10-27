package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepagePage {
    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    WebElement getelementsButton() {
        return driver.findElement(By.className("card-body"));
    }

    WebDriver elementsButton;

    public List<WebElement> getElementsButton() {
        return driver.findElements(By.className("card-body"));
    }

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals(cardName)) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }


}
