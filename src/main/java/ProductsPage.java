import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    public ProductsPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id=\"add-to-cart-sauce-labs-backpack\"]" )
    private WebElement addToCardButton;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addToCardButton2;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addToCardItem3;
    @FindBy(xpath ="//a[@class='shopping_cart_link']" )
    private WebElement cartBadge;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    private WebElement removeButton;
    @FindBy(xpath ="//button[@id='remove-sauce-labs-backpack']" )
    private WebElement removeButton2;
    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement pageLogo;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement inventoryItemLink;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutLink;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement sideBarMenu;
    @FindBy(xpath ="//select[@class='product_sort_container']" )
    private WebElement filterMenu;
    @FindBy(xpath ="//a[@class='shopping_cart_link']" )
    private WebElement cartIcon;
    public void addToCard(){
        addToCardButton.click();
    }
    public void addToCard2(){
        addToCardButton2.click();
    }
    public String getCartBadge(){
        return cartBadge.getText();
    }
    public String getRemoveButton(){
        return removeButton.getText();
    }
    public String getRemoveButton2(){
        return removeButton2.getText();
    }
    public String getLogo(){
        return pageLogo.getText();
    }
    public void clickInventoryItemLink(){
        inventoryItemLink.click();
    }
    public void logOut(){
        logoutLink.click();
    }
    public void clickSideBarMenu(){
        sideBarMenu.click();
    }
    public void clickFilter(){
        Select filterSelect = new Select(filterMenu);
        filterSelect.selectByVisibleText("Name (Z to A)");
        filterMenu.click();
    }
    public String getFilter(){
        return filterMenu.getText();
    }
    public void clickCartIcon(){
        cartIcon.click();
    }
    public void addToCard3(){
        addToCardItem3.click();
    }

    public void logoutGeneral(){
        clickSideBarMenu();
        logOut();
    }
    public void waitTheElementTest1(Duration time) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='remove-sauce-labs-backpack']")));
    }

    public void waitTheElementFilter(Duration time) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='product_sort_container']")));
    }
    public void waitTheElementRemoveBtn(Duration time){
        WebDriverWait wait = new WebDriverWait(Driver.driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']")));
    }
}