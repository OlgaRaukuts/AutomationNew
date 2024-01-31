import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage implements DriverNew{
    public CartPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkoutButton;
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    private WebElement firstName;
    @FindBy(xpath = "//*[@id=\"last-name\"]")
    private WebElement lastName;
    @FindBy(xpath ="//*[@id=\"postal-code\"]" )
    private WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continueButton;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutOverview;
    @FindBy(xpath = "//*[@id=\"finish\"]")
    private WebElement finishButton;
    @FindBy(xpath ="//span[@class='title']" )
    private WebElement finishedOrder;
    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    private WebElement backHomeButton;
    @FindBy(xpath = "//div[@class='checkout_info']")
    private WebElement checkoutInfo;
    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    private WebElement removeButtonCartPage;
    @FindBy(xpath = "//div[@class='item_pricebar']")
    private WebElement cartItem;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartItemEmpty;
    @FindBy(xpath ="//h3[@data-test='error']" )
    private WebElement errorFN;
    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    private WebElement continueShopping;
    @FindBy(xpath = "//*[@id=\"cancel\"]")
    private WebElement cancelButton;

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    public void setFirstName(String firstname){
        firstName.sendKeys(firstname);
    }
    public void setLastName(String lastname){
        lastName.sendKeys(lastname);
    }
    public void setZipCode(String zipcode){
       zipCode.sendKeys(zipcode);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public boolean getCheckoutOverview(){
       return checkoutOverview.isDisplayed();
    }
    public void clickFinishButton(){
        finishButton.click();
    }
    public boolean getFinishedOrder(){
        return finishedOrder.isDisplayed();
    }
    public void clickBackHomeButton(){
        backHomeButton.click();
    }
    public boolean getCheckoutInfoForm(){
        return checkoutInfo.isDisplayed();
    }
    public void removeProduct(){
        removeButtonCartPage.click();
    }
    public boolean getCartItem(){
        return cartItemEmpty.isDisplayed();
    }
    public String getErrorFN(){
        return errorFN.getText();
    }
    public void clickContinueShopping(){
        continueShopping.click();
    }
    public void clickCancelButton(){
        cancelButton.click();
    }
    public void fillTheForm(String strFirstName, String strLastName, String strZipCode){
        this.setFirstName(strFirstName);
        this.setLastName(strLastName);
        this.setZipCode(strZipCode);
    }
    public void waitForTheElementCkt(Duration time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout\"]")));
    }


}
