import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTests extends ForLoginTest{
    @Test(description = "open Log in page and find some elements")
    public void logInPage(){
        loginPage.login("standard_user", "secret_sauce");
        loginPage.waitforLogIn(Duration.ofSeconds(10));
        loginPage.clickLoginButton();
        Assert.assertTrue(productsPage.getLogo().contains("Swag Labs"));
        log.info("Log in page successfully opened");
        productsPage.logoutGeneral();

    }
    @Test(description = "enter wrong credentials")
    public void logInPageWrong(){
        loginPage.login("standard_user", "secrets_sauce");
        loginPage.waitforLogIn(Duration.ofSeconds(10));
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getErrorMessage().contains("password do not match any user in this service"));
        log.info("The error message appeared");
    }
}
