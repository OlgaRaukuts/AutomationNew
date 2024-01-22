import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTests extends BaseTest{
    @Test(description = "add a product to the cart and finish the buying", priority = 1)
    public void orderProduct(){
        cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.getCheckoutInfoForm());
        cartPage.fillTheForm("olga","ra","s233");
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getCheckoutOverview());
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
        log.info("The buying was finished successfully");
    }
   @Test(description = "remove a product from the cart", priority = 2)
    public void removeProduct(){
        cartPage.removeProduct();
       // Assert.assertTrue(cartPage.getCartItem()); подумать над ассертом
       log.info("The item was successfully removed");
        cartPage.clickContinueShopping();
    }
     @Test(description = "checkout without products", priority = 3)
    public void checkoutEmptyCart() {
         cartPage.clickCheckoutButton();
         cartPage.fillTheForm("olga", "ra", "s233");
         cartPage.clickContinueButton();
         cartPage.clickFinishButton();
         log.info("Checkout without products was finished successfully");
         Assert.assertTrue(cartPage.getFinishedOrder());
     }

    @Test(description = "checkout without filling checkout form", priority = 4)
    public void checkoutEmptyCheckoutForm(){
        cartPage.clickCheckoutButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getErrorFN().contains("Error: First Name is required"));
        cartPage.clickCancelButton();
        log.info("It doesn't work without filling out the necessary fields ");
        //cartPage.clickContinueShopping();
        //productsPage.clickSideBarMenu();
    }

}
