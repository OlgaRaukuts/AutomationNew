import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    public WebDriver driver;
    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }
    By addToCardButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By cartBadge = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");
    By removeButton = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    By pageLogo = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div");
    By inventoryItemLink = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div");

    public void addToCard(){
        driver.findElement(addToCardButton).click();
    }
    public String getCartBadge(){
        return driver.findElement(cartBadge).getText();
    }
    public String getRemoveButton(){
        return driver.findElement(removeButton).getText();
    }
    public String getLogo(){
        return driver.findElement(pageLogo).getText();
    }
    public void clickInventoryItemLink(){
        driver.findElement(inventoryItemLink).click();
    }

}
