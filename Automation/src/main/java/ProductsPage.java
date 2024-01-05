import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
    public WebDriver driver;
    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }
    By addToCardButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By getAddToCardButton2 = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
    By cartBadge = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");
    By removeButton = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    By pageLogo = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div");
    By inventoryItemLink = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div");

    By logoutLink = By.xpath("//*[@id=\"logout_sidebar_link\"]");
    By sideBarMenu = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By filterMenu = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select");
    By cartIcon = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    public void addToCard(){
        driver.findElement(addToCardButton).click();
    }
    public void addToCard2(){
        driver.findElement(getAddToCardButton2).click();
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
    public void logOut(){
        driver.findElement(logoutLink).click();
    }
    public void clickSideBarMenu(){
        driver.findElement(sideBarMenu).click();
    }
    public void clickFilter(){
        Select filterSelect = new Select(driver.findElement(filterMenu));
        filterSelect.selectByVisibleText("Name (Z to A)");
        driver.findElement(filterMenu).click();
    }
    public String getFilter(){
        return driver.findElement(filterMenu).getText();
    }
    public void clickCartIcon(){
        driver.findElement(cartIcon).click();
    }
}
