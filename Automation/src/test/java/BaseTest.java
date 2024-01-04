import org.example.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static  WebDriver driver;
    ProductsPage productsPage;
    LoginPage loginPage;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.firefox.driver", ConfProperties.getProperty("firefoxdriver"));
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}
