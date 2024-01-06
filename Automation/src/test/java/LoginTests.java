import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest{
    LoginPage loginPage;
    ProductsPage productsPage;
    @BeforeMethod
    public void setupPreconditions(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }
    @Test(description = "open Log in page and find some elements")
    public void logInPage(){
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertTrue(productsPage.getLogo().contains("Swag Labs"));
        productsPage.clickSideBarMenu();
        productsPage.logOut();
    }
    @Test(description = "enter wrong credentials")
    public void logInPageWrong(){
        loginPage.login("standard_user", "secrets_sauce");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getErrorMessage().contains("password do not match any user in this service"));
    }

}
