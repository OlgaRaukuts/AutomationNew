import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements DriverNew{

    @BeforeMethod
    public static void setupPreconditions(){
        Configuration.browser = "firefox";
        open("https://www.saucedemo.com/");
    }

}