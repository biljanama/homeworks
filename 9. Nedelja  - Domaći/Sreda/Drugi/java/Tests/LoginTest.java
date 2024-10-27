package Tests;

import Base.BaseTest;
import Base.ExcelReader;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("http://the-internet.herokuapp.com/login");
    }



    @Test

    public void userCanlogInWithValidCredentials() {
        String validUsername = excelReader.getStringData("Sheet1", 1,0);
        String validPassword = excelReader.getStringData("Sheet1",1, 1 );

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();

    }

    @Test

    public void userCantLogInWithValidUsernameInvalidPassword() {
        String validUsername = excelReader.getStringData("Sheet1",1, 0 );
        String invalidPassword = excelReader.getStringData("Sheet1", 1,3);
        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        //Assert...

    }

    @Test

    public void userCantLogInWithInvalidUsernameValidPassword() {

        String invalidUsername = excelReader.getStringData("Sheet1",1, 2 );
        String validPassword = excelReader.getStringData("Sheet1", 1,1);

        loginPage.inputUsername(invalidUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();



    }

    @Test

    public void userCantLogInWithInvalidCredentials() {

        String invalidUsername = excelReader.getStringData("Sheet1", 1, 2);
        String invalidPassword = excelReader.getStringData("Sheet1", 1,3 );
        loginPage.inputUsername(invalidUsername);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickOnLoginButton();

    }
}
