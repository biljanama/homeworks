package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SidebarPage {

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public WebElement getTextBoxButton() {
        return driver.findElement(By.className("text"));
    }

    WebElement textBoxButton;

    public List<WebElement> getButton() {
        return driver.findElements(By.className("text"));
    }

    public void clickOnButton(String buttonName) {
        for (int i = 0; i < getButton().size(); i++) {
            if (getButton().get(i).getText().equals(buttonName)) {
                getButton().get(i).click();
                break;
            }
        }
    }

}
