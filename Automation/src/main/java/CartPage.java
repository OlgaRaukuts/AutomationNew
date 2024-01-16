import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage (WebDriver driver){
        this.driver = driver;
    }


    By checkoutButton = By.xpath("//*[@id=\"checkout\"]");
    By firstName = By.xpath("//*[@id=\"first-name\"]");
    By lastName = By.xpath("//*[@id=\"last-name\"]");
    By zipCode = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.xpath("//*[@id=\"continue\"]");
    By checkoutOverview = By.xpath("//span[@class='title']");
    By finishButton = By.xpath("//*[@id=\"finish\"]");
    By finishedOrder = By.xpath("//span[@class='title']");
    By backHomeButton = By.xpath("//*[@id=\"back-to-products\"]");
    By checkoutInfo = By.xpath("//div[@class='checkout_info']");
    By removeButtonCartPage = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    By cartItem = By.xpath("//div[@class='item_pricebar']");
    By errorFN = By.xpath("//h3[@data-test='error']");
    By continueShopping = By.xpath("//*[@id=\"continue-shopping\"]");
    By cancelButton = By.xpath("//*[@id=\"cancel\"]");

    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void setFirstName(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
    }
    public void setLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }
    public void setZipCode(String zipcode){
        driver.findElement(zipCode).sendKeys(zipcode);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public boolean getCheckoutOverview(){
        return driver.findElement(checkoutOverview).isDisplayed();
    }
    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
    public boolean getFinishedOrder(){
        return driver.findElement(finishedOrder).isDisplayed();
    }
    public void clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }
    public boolean getCheckoutInfoForm(){
        return driver.findElement(checkoutInfo).isDisplayed();
    }
    public void removeProduct(){
        driver.findElement(removeButtonCartPage).click();
    }
    public boolean getCartItem(){
        return !driver.findElement(cartItem).isDisplayed();
    }
    public String getErrorFN(){
        return driver.findElement(errorFN).getText();
    }
    public void clickContinueShopping(){
        driver.findElement(continueShopping).click();
    }
    public void clickCancelButton(){
        driver.findElement(cancelButton).click();
    }
    public void fillTheForm(String strFirstName, String strLastName, String strZipCode){
        this.setFirstName(strFirstName);
        this.setLastName(strLastName);
        this.setZipCode(strZipCode);
    }


}
