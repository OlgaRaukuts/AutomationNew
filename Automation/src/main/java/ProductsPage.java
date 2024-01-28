import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    private WebDriver driver;
    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }
    private By addToCardButton = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By addToCardButton2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");

    private By addToCardItem3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    private By cartBadge = By.xpath("//a[@class='shopping_cart_link']");
    private By removeButton = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
    private By removeButton2 = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private By pageLogo = By.xpath("//div[@class='app_logo']");
    private By inventoryItemLink = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    private By logoutLink = By.xpath("//a[@id='logout_sidebar_link']");
    private By sideBarMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    private By filterMenu = By.xpath("//select[@class='product_sort_container']");
    private By cartIcon = By.xpath("//a[@class='shopping_cart_link']");
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
    public void waitTheElementTest1(Duration time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='remove-sauce-labs-backpack']")));
    }

    public void waitTheElementFilter(Duration time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='product_sort_container']")));
    }
    public void waitTheElementRemoveBtn(Duration time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']")));
    }
}