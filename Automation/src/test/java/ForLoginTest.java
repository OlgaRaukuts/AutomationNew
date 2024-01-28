import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ForLoginTest {
    protected static WebDriver driver = new FirefoxDriver();;
    protected static ProductsPage productsPage;
    protected static LoginPage loginPage;
    protected static Logger logger = LogManager.getLogger();
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
        logger.info("General Setup was successful");
    }
    @BeforeMethod
    public static void setupPreconditions(){
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        productsPage = new ProductsPage(driver);
        logger.info("Setup preconditions - done");

    }
    @AfterClass
    public void close() {
        driver.close();
        logger.info("Driver closed successfully");
    }
}
