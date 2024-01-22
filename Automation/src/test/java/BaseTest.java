import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static  WebDriver driver = new FirefoxDriver();;
    protected static ProductsPage productsPage;
    protected static LoginPage loginPage;
    protected static ProductPage productPage;
    protected static CartPage cartPage;
    protected static Logger log = LogManager.getLogger();
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
        log.info("Setup finished");
    }
    @BeforeMethod
    public static void setupPreconditions(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        log.info("Setup preconditions finished");
        productsPage.addToCard();
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
    }
    @AfterMethod
    public void logOut(){
        productsPage.logoutGeneral();
        log.info("Log out successfully");
    }
    @AfterClass
    public void close() {
        driver.close();
        log.info("Driver closed successfully");
    }
}
