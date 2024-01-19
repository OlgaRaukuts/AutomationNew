import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTests extends BaseTest{
    @Test(description = "add a product to the cart and finish the buying", priority = 1)
    public void orderProduct(){
        BaseTest.setupPreconditionsCart();
        cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.getCheckoutInfoForm());
        cartPage.fillTheForm("olga","ra","s233");
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getCheckoutOverview());
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
    }
   @Test(description = "remove a product from the cart", priority = 2)
    public void removeProduct(){
        BaseTest.setupPreconditionsCart();
        cartPage.removeProduct();
       // Assert.assertTrue(cartPage.getCartItem()); подумать над ассертом
        cartPage.clickContinueShopping();
    }
     @Test(description = "checkout without products", priority = 3)
    public void checkoutEmptyCart() {
         BaseTest.setupPreconditionsCart();
         log.info("Sample INFO message");
         cartPage.clickCheckoutButton();
         cartPage.fillTheForm("olga", "ra", "s233");
         cartPage.clickContinueButton();
         cartPage.clickFinishButton();
         Assert.assertTrue(cartPage.getFinishedOrder());
     }

    @Test(description = "checkout without filling checkout form", priority = 4)
    public void checkoutEmptyCheckoutForm(){
        BaseTest.setupPreconditionsCart();
        cartPage.clickCheckoutButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getErrorFN().contains("Error: First Name is required"));
        cartPage.clickCancelButton();
        //cartPage.clickContinueShopping();
        //productsPage.clickSideBarMenu();
    }

}
