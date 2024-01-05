import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTests extends BaseTest{
    public ProductsPage productsPage;
    public LoginPage loginPage;
    public CartPage cartPage;
    @Test(description = "add a product to the cart and finish the buying")
    public void orderProduct(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.addToCard();
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
        //Assert.assertTrue(productsPage.getLogo().contains("Swag Labs"));
        cartPage.clickCheckoutButton();
        Assert.assertTrue(cartPage.getCheckoutInfoForm());
        cartPage.setFirstName("olga");
        cartPage.setLastName("ra");
        cartPage.setZipCode("2033");
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getCheckoutOverview());
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
    }
    @Test(description = "remove a product from the cart")
    public void removeProduct(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.addToCard();
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
        cartPage.removeProduct();
       // Assert.assertTrue(cartPage.getCartItem()); подумать над ассертом
    }
    @Test(description = "checkout without products")
    public void checkoutEmptyCart(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();
        cartPage.setFirstName("olga");
        cartPage.setLastName("ra");
        cartPage.setZipCode("2033");
        cartPage.clickContinueButton();
        cartPage.clickFinishButton();
        Assert.assertTrue(cartPage.getFinishedOrder());
    }
    @Test(description = "checkout without filling checkout form")
    public void checkoutEmptyCheckoutForm(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickCartIcon();
        cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();
        cartPage.clickContinueButton();
        Assert.assertTrue(cartPage.getErrorFN().contains("Error: First Name is required"));
    }
}
