import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest{
    protected static ProductsPage productsPage;
    protected static LoginPage loginPage;
    protected static ProductPage productPage;
    protected static CartPage cartPage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        Driver.driver.manage().window().maximize();
        Driver.driver.get(ConfProperties.getProperty("loginpage"));
        Driver.log.info("Setup was finished successfully");

    }
    @BeforeMethod
    public static void setupPreconditions() throws NoElementWasFound {
        loginPage = new LoginPage(Driver.driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(Driver.driver);
        productPage = new ProductPage(Driver.driver);
        cartPage = new CartPage(Driver.driver);
        Driver.log.info("set up preconditions were finished successfully");
    }
    @AfterMethod
    public void logOut() throws NoElementWasFound{
        productsPage.logoutGeneral();
        Driver.log.info("Log out was finished successfully");
    }
    @AfterClass
    public void close() {
        Driver.driver.close();
    }
}