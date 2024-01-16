import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
    private WebDriver driver;
    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }
    By addToCardButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By addToCardButton2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");

    By addToCardItem3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    By cartBadge = By.xpath("//a[@class='shopping_cart_link']");
    By removeButton = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
    By removeButton2 = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    By pageLogo = By.xpath("//div[@class='app_logo']");
    By inventoryItemLink = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

    By logoutLink = By.xpath("//a[@id='logout_sidebar_link']");
    By sideBarMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    By filterMenu = By.xpath("//select[@class='product_sort_container']");
    By cartIcon = By.xpath("//a[@class='shopping_cart_link']");
    public void addToCard(){
        driver.findElement(addToCardButton).click();
    }
    public void addToCard2(){
        driver.findElement(addToCardButton2).click();
    }
    public String getCartBadge(){
        return driver.findElement(cartBadge).getText();
    }
    public String getRemoveButton(){
        return driver.findElement(removeButton).getText();
    }
    public String getRemoveButton2(){
        return driver.findElement(removeButton2).getText();
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
    public void addToCard3(){
        driver.findElement(addToCardItem3).click();
    }

    public void logoutGeneral(){
        clickSideBarMenu();
        logOut();
    }

}
