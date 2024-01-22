import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    public ProductPage (WebDriver driver){
        this.driver = driver;
    }

    private By itemDetailsName = By.xpath("//div[@class='inventory_details_name large_size']");
    private By backToProducts = By.xpath("//*[@id=\"back-to-products\"]");

    public String getItemDetails(){
        return driver.findElement(itemDetailsName).getText();
    }
    public void clickBackToProducts(){
        driver.findElement(backToProducts).click();
    }

}
