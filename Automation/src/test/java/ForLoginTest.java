import org.example.ConfProperties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ForLoginTest extends Driver{
    protected static ProductsPage productsPage;
    protected static LoginPage loginPage;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
        log.info("General Setup was successful");
    }
    @BeforeMethod
    public static void setupPreconditions(){
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        productsPage = new ProductsPage(driver);
        log.info("Setup preconditions - done");

    }
    @AfterClass
    public void close() {
        driver.close();
        log.info("Driver closed successfully");
    }
}
