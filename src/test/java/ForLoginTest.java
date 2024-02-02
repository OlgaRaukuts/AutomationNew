import org.example.ConfProperties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ForLoginTest {
    protected static ProductsPage productsPage;
    protected static LoginPage loginPage;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        Driver.driver.manage().window().maximize();
        Driver.driver.get(ConfProperties.getProperty("loginpage"));
        Driver.log.info("General Setup was successful");
    }
    @BeforeMethod
    public static void setupPreconditions(){
        loginPage = new LoginPage(Driver.driver);
        Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        productsPage = new ProductsPage(Driver.driver);
        Driver.log.info("Setup preconditions - done");

    }
    @AfterClass
    public void close() {
        Driver.driver.close();
        Driver.log.info("Driver closed successfully");
    }
}
