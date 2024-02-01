import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement loginButton;
    @FindBy(xpath ="//h3[@data-test='error']" )
    private WebElement errorMessage;

    public void setUsernameField(String username) {
       userName.sendKeys(username);
    }

    public void setPasswordField(String passwordU) {
        password.sendKeys(passwordU);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
    public void login(String strUserName, String strPasword) {
        this.setUsernameField(strUserName);
        this.setPasswordField(strPasword);
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public boolean getLogInButton(){
        return loginButton.isDisplayed();
    }
    public void waitforLogIn(Duration time){
        WebDriverWait wait = new WebDriverWait(Driver.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));
    }

}
