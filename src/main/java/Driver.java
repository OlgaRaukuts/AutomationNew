import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    protected static WebDriver driver = new FirefoxDriver();
    protected static Logger log = LogManager.getLogger();
}
