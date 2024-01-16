import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.xpath("//*[@id=\"user-name\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@id=\"login-button\"]");
    By errorMessage = By.xpath("//h3[@data-test='error']");

    public void setUsernameField(String username) {
        driver.findElement(userName).sendKeys(username);
        System.out.println("The username was entered");
    }

    public void setPasswordField(String passwordU) {
        driver.findElement(password).sendKeys(passwordU);
        System.out.println("The password was entered");
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
