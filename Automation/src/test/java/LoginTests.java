import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
    public  WebDriver driver = new FirefoxDriver();

    @Test(description = "open Log in page and find some elements")
    public void logInPage(){

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        //loginPage.waitConditions(loginPage.usernameField, Duration.ofSeconds(20));
        loginPage.setUsernameField(loginPage.usernameField);
        loginPage.setPasswordField(loginPage.passwordField);
        Assert.assertEquals(loginPage.loginButton, loginPage.loginButton);
        //loginPage.openHomePage();
    }

}
