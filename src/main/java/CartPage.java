import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
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

    public void clickCheckoutButton() throws NoElementWasFound{
        if(checkoutButton == null){
            throw new NoElementWasFound("There is no Checkout Button");
        }
        checkoutButton.click();
    }
    public void setFirstName(String firstname) throws NoElementWasFound{
        if(firstname == null){
            throw new NoElementWasFound("There is no First Name field");
        }
        firstName.sendKeys(firstname);
    }
    public void setLastName(String lastname) throws NoElementWasFound{
        if(lastName == null){
            throw new NoElementWasFound("There is no Last Name field");
        }
        lastName.sendKeys(lastname);
    }
    public void setZipCode(String zipcode) throws NoElementWasFound {
        if(zipCode == null){
            throw new NoElementWasFound("There is no ZipCode field");
        }
       zipCode.sendKeys(zipcode);
    }

    public void clickContinueButton() throws NoElementWasFound{
        if(continueButton == null){
            throw new NoElementWasFound("There is no Continue Button");
        }
        continueButton.click();
    }

    public boolean getCheckoutOverview() throws NoElementWasFound{
        if(checkoutOverview == null){
            throw new NoElementWasFound("There is no Checkout Overview");
        }
       return checkoutOverview.isDisplayed();
    }
    public void clickFinishButton() throws NoElementWasFound{
        if(finishButton == null){
            throw new NoElementWasFound("There is no Finish Button");
        }
        finishButton.click();
    }
    public boolean getFinishedOrder() throws NoElementWasFound{
        if(finishedOrder == null){
            throw new NoElementWasFound("There is no Finish Order");
        }
        return finishedOrder.isDisplayed();
    }
    public void clickBackHomeButton(){
        backHomeButton.click();
    }
    public boolean getCheckoutInfoForm() throws NoElementWasFound{
        if(checkoutInfo == null){
            throw new NoElementWasFound("There is no Checkout info");
        }
        return checkoutInfo.isDisplayed();
    }
    public void removeProduct() throws NoElementWasFound{
        if(removeButtonCartPage == null){
            throw new NoElementWasFound("There is no Remove Button");
        }
        removeButtonCartPage.click();
    }
    public boolean getCartItem() throws NoElementWasFound {
        if(cartItemEmpty == null){
            throw new NoElementWasFound("There is no Cart Item");
        }
        return cartItemEmpty.isDisplayed();
    }
    public String getErrorFN() throws NoElementWasFound{
        if(errorFN == null){
            throw new NoElementWasFound("There is no Error message");
        }
        return errorFN.getText();
    }
    public void clickContinueShopping() throws NoElementWasFound{
        if(continueShopping == null){
            throw new NoElementWasFound("There is no Continue shopping Button");
        }
        continueShopping.click();
    }
    public void clickCancelButton() throws NoElementWasFound{
        if(cancelButton == null){
            throw new NoElementWasFound("There is no Cancel Button");
        }
        cancelButton.click();
    }
    public void fillTheForm(String strFirstName, String strLastName, String strZipCode) throws NoElementWasFound{
        this.setFirstName(strFirstName);
        this.setLastName(strLastName);
        this.setZipCode(strZipCode);
    }
    public void waitForTheElementCkt(Duration time){
        WebDriverWait wait = new WebDriverWait(Driver.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout\"]")));
    }


}
