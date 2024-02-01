import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTest {
    @Test(description = "open Log in page and find some elements")
    public void logInPage(){
       $(By.cssSelector("#user-name")).setValue("standard_user");
       $(By.cssSelector("#password")).setValue("secret_sauce");
       $("#login-button").click();
       $(".app_logo").shouldHave(text("Swag Labs"));
    }


    @Test(description = "enter wrong credentials")
    public void logInPageWrong(){
       $(By.cssSelector("#user-name")).setValue("standard_user");
       $(By.cssSelector("#password")).setValue("secret_sauces");
       $("#login-button").click();
       $("h3[data-test='error']").shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
    }

}
