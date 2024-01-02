import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public static final String SWAG_LABS = "https://https://www.saucedemo.com/";

    public LoginPage(WebDriver driver) {
        //PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void setUsernameField(WebElement usernameField) {
        this.usernameField = usernameField;
        usernameField.sendKeys("standard_user");
        System.out.println("The username was entered");
    }

    public void setPasswordField(WebElement passwordField) {
        this.passwordField = passwordField;
        passwordField.sendKeys("secret_sauce");
        System.out.println("The password was entered");
    }

    public void clickLoginButton(WebElement loginButton){
        loginButton.click();
    }
}
