package Base;

import Pages.AddRemoveElementsPage;
import Pages.CheckBoxesPage;
import Pages.DropdownPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;
    public AddRemoveElementsPage addRemoveElementsPage;
    public CheckBoxesPage checkBoxesPage;
    public DropdownPage dropdownPage;

    @BeforeClass

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        checkBoxesPage = new CheckBoxesPage(driver);
        dropdownPage = new DropdownPage(driver);


}



}
