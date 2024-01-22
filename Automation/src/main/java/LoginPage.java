import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userName = By.xpath("//*[@id=\"user-name\"]");
    private By password = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("//*[@id=\"login-button\"]");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    public void setUsernameField(String username) {
        driver.findElement(userName).sendKeys(username);
    }

    public void setPasswordField(String passwordU) {
        driver.findElement(password).sendKeys(passwordU);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void login(String strUserName, String strPasword) {
        this.setUsernameField(strUserName);
        this.setPasswordField(strPasword);
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public boolean getLogInButton(){
        return driver.findElement(loginButton).isDisplayed();
    }

}
