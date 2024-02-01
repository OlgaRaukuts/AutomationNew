import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartPageTests extends BaseTest{
    @Test(description = "add a product to the cart and finish the buying", priority = 1)
    public void orderProduct(){
        productsPage.addToCard();
        productsPage.clickCartIcon();
        cartPage.waitForTheElementCkt(Duration.ofSeconds(10));
        cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.getCheckoutInfoForm());
        cartPage.fillTheForm("olga","ra","s233");
        cartPage.clickContinueButton();
        Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        Assert.assertTrue(cartPage.getCheckoutOverview());
        cartPage.clickFinishButton();
        Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        Assert.assertTrue(cartPage.getFinishedOrder());
        //Driver.log.info("The buying was finished successfully");
    }
   @Test(description = "remove a product from the cart", priority = 2)
    public void removeProduct(){
       productsPage.addToCard();
       productsPage.clickCartIcon();
       Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
       cartPage.removeProduct();
       Assert.assertTrue(cartPage.getCartItem());
       //Driver.log.info("The item was successfully removed");
       cartPage.clickContinueShopping();
    }
     @Test(description = "checkout without products", priority = 3)
    public void checkoutEmptyCart() {
         productsPage.addToCard();
         productsPage.clickCartIcon();
         Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
         cartPage.clickCheckoutButton();
         cartPage.fillTheForm("olga", "ra", "s233");
         cartPage.clickContinueButton();
         cartPage.clickFinishButton();
         //Driver.log.info("Checkout without products was finished successfully");
         Assert.assertTrue(cartPage.getFinishedOrder());
     }

    @Test(description = "checkout without filling checkout form", priority = 4)
    public void checkoutEmptyCheckoutForm(){
        productsPage.addToCard();
        Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        productsPage.clickCartIcon();
        cartPage.clickCheckoutButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getErrorFN().contains("Error: First Name is required"));
        cartPage.clickCancelButton();
        //Driver.log.info("It doesn't work without filling out the necessary fields ");
    }
}
