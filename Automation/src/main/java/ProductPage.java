import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    public WebDriver driver;
    public ProductPage (WebDriver driver){
        this.driver = driver;
    }

    By itemDetailsName = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]");
    By backToProducts = By.xpath("//*[@id=\"back-to-products\"]");

    public String getItemDetails(){
        return driver.findElement(itemDetailsName).getText();
    }
    public void clickBackToProducts(){
        driver.findElement(backToProducts).click();
    }

}
