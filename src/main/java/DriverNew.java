import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;

public interface DriverNew {
    WebDriver driver = new FirefoxDriver();
    Logger log = (Logger) LogManager.getLogger();
}
