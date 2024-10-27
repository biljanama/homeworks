package Base;

import Pages.HomepagePage;
import Pages.SidebarPage;
import Pages.TextBoxFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    //Otici na https://demoqa.com/ sajt, zatim na elements->text box i
    // testirati popunjavanje forme sa validnim, nevalidnim mail-om i
    // proveriti da li je output ispravan za svako polje

    public WebDriver driver;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public TextBoxFormPage textBoxFormPage;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepagePage = new HomepagePage(driver);
        sidebarPage = new SidebarPage(driver);
        textBoxFormPage = new TextBoxFormPage(driver);

    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }
}
