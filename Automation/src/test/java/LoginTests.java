import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {
    public static LoginPage loginPage;
    @BeforeTest
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        WebDriver driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test(description = "open Log in page and find some elements")
    public void logInPage(){
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
       // Assert.assertEquals();
    }

    @Test(description = "enter wrong credentials")
    public void logInPageWrong(){
        loginPage.login("standart_user", "secrets_sauce");
        loginPage.clickLoginButton();
        Assert.assertEquals("password do not match any user in this service", "password do not match any user in this service");
    }

}
