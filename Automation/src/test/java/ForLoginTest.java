import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ForLoginTest {
    public static WebDriver driver;
    public static ProductsPage productsPage;
    public static LoginPage loginPage;
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
        productsPage = new ProductsPage(driver);
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
