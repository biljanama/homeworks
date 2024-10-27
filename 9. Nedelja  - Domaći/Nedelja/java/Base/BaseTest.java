package Base;

import Pages.HomepagePage;
import Pages.LoginPage;
import Pages.PracticeFormPage;
import Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;
    public ExcelReader excelReader;
    public HomepagePage homepagePage;
    public LoginPage loginPage;
    public PracticeFormPage practiceFormPage;
    public SidebarPage sidebarPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        excelReader = new ExcelReader("C:\\Users\\Biljana\\Desktop\\TestData.xlsx");
        homepagePage = new HomepagePage();
        loginPage = new LoginPage();
        practiceFormPage = new PracticeFormPage();
        sidebarPage = new SidebarPage();
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}
