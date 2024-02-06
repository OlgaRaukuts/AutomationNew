import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTests extends ForLoginTest{
    @Test(description = "open Log in page and find some elements")
    public void logInPage() throws NoElementWasFound{
        loginPage.login("standard_user", "secret_sauce");
        loginPage.waitforLogIn(Duration.ofSeconds(10));
        loginPage.clickLoginButton();
        Asserts.useAssertLogIn();
        Driver.log.info("Log in page successfully opened");
        productsPage.logoutGeneral();

    }
    @Test(description = "enter wrong credentials")
    public void logInPageWrong() throws NoElementWasFound{
        loginPage.login("standard_user", "secrets_sauce");
        loginPage.waitforLogIn(Duration.ofSeconds(10));
        loginPage.clickLoginButton();
        Asserts.useAssertLogInErr();
        Driver.log.info("The error message appeared");
    }
}
