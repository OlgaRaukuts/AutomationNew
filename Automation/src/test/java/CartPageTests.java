import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTests extends BaseTest{
    public ProductsPage productsPage;
    public LoginPage loginPage;
    public CartPage cartPage;
    @BeforeMethod
    public void setupPreconditions(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.addToCard();
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
    }
    @Test(description = "add a product to the cart and finish the buying")
    public void orderProduct(){
        cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.getCheckoutInfoForm());
        cartPage.fillTheForm("olga","ra","s233");
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getCheckoutOverview());
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
        productsPage.logoutGeneral();
    }
   @Test(description = "remove a product from the cart")
    public void removeProduct(){
        cartPage.removeProduct();
       // Assert.assertTrue(cartPage.getCartItem()); подумать над ассертом
        cartPage.clickContinueShopping();
        productsPage.logoutGeneral();
    }
     @Test(description = "checkout without products")
    public void checkoutEmptyCart(){
        cartPage.clickCheckoutButton();
        cartPage.fillTheForm("olga","ra","s233");
        cartPage.clickContinueButton();
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
        productsPage.logoutGeneral();

    }
/*   @Test(description = "checkout without filling checkout form")
    public void checkoutEmptyCheckoutForm(){
        cartPage.clickCheckoutButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getErrorFN().contains("Error: First Name is required"));
        cartPage.clickCancelButton();
        cartPage.clickContinueShopping();
        productsPage.clickSideBarMenu();
        productsPage.logOut();
    }

 */

}
