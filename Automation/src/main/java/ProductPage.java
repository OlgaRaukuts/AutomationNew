import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    public ProductPage (WebDriver driver){
        this.driver = driver;
    }

    private By itemDetailsName = By.xpath("//div[@class='inventory_details_name large_size']");
    private By backToProducts = By.xpath("//*[@id=\"back-to-products\"]");
    //private By addToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public String getItemDetails(){
        return driver.findElement(itemDetailsName).getText();
    }
    public void clickBackToProducts(){
        driver.findElement(backToProducts).click();
    }

    public void waitTheElementProductPage(Duration time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")));
    }

}
