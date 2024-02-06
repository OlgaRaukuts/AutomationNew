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
    public void addToCard() throws NoElementWasFound{
        if(addToCardButton == null){
            throw new NoElementWasFound("There is no Add To Cart button");
        }
        addToCardButton.click();
    }
    public void addToCard2() throws NoElementWasFound{
        if(addToCardButton2 == null){
            throw new NoElementWasFound("There is no Add To Cart button");
        }
        addToCardButton2.click();
    }
    public String getCartBadge(){
        return cartBadge.getText();
    }
    public String getRemoveButton() throws NoElementWasFound {
        if(removeButton == null){
            throw new NoElementWasFound("There is no Remove Button");
        }
        return removeButton.getText();
    }
    public String getRemoveButton2() throws NoElementWasFound{
        if(removeButton2 == null){
            throw new NoElementWasFound("There is no Remove Button");
        }
        return removeButton2.getText();
    }
    public String getLogo() throws NoElementWasFound{
        if(pageLogo == null){
            throw new NoElementWasFound("There is no Page Logo");
        }
        return pageLogo.getText();
    }
    public void clickInventoryItemLink() throws NoElementWasFound{
        if(inventoryItemLink == null){
            throw new NoElementWasFound("There is no Inventory item link");
        }
        inventoryItemLink.click();
    }
    public void logOut() throws NoElementWasFound{
        if(logoutLink == null){
            throw new NoElementWasFound("There is no Logout link");
        }
        logoutLink.click();
    }
    public void clickSideBarMenu() throws NoElementWasFound{
        if(sideBarMenu == null){
            throw new NoElementWasFound("There is no Side BAr Menu");
        }
        sideBarMenu.click();
    }
    public void clickFilter() throws NoElementWasFound{
        if(filterMenu == null){
            throw new NoElementWasFound("There is no Filter Menu");
        }
        Select filterSelect = new Select(filterMenu);
        filterSelect.selectByVisibleText("Name (Z to A)");
        filterMenu.click();
    }
    public String getFilter() throws NoElementWasFound{
        if(filterMenu == null){
            throw new NoElementWasFound("There is no Filter Menu");
        }
        return filterMenu.getText();
    }
    public void clickCartIcon() throws NoElementWasFound{
        if(cartIcon == null){
            throw new NoElementWasFound("There is no Cart Icon");
        }
        cartIcon.click();
    }
    public void addToCard3() throws NoElementWasFound{
        if(removeButton2 == null){
            throw new NoElementWasFound("There is no Add to cart button");
        }
        addToCardItem3.click();
    }

    public void logoutGeneral() throws NoElementWasFound{
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