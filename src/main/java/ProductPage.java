import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage implements DriverNew {
    public ProductPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    private WebElement itemDetailsName;
    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    private WebElement backToProducts;
    //private By addToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public String getItemDetails(){
        return itemDetailsName.getText();
    }
    public void clickBackToProducts(){
        backToProducts.click();
    }

    public void waitTheElementProductPage(Duration time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")));
    }

}
