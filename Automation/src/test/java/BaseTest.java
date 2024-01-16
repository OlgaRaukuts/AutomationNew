import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {
    public static  WebDriver driver;
    public static ProductsPage productsPage;
    public static LoginPage loginPage;
    public static ProductPage productPage;
    public static CartPage cartPage;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }
    @BeforeMethod
    public static void setupPreconditions(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
    }
    public static void  setupPreconditionsCart(){
        productsPage.addToCard();
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
    }

    @AfterMethod
    public void logOut(){
        productsPage.logoutGeneral();
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
