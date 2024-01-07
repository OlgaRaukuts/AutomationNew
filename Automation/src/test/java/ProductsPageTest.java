import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest{
    public ProductsPage productsPage;
    public LoginPage loginPage;
    public ProductPage productPage;
    @BeforeMethod
    public void setupPreconditions(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
    }
    @Test (description = "add a product to the cart")
    public void addProduct(){
        productsPage.addToCard();
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
        productsPage.logoutGeneral();

    }
    @Test(description = "open a product page")
    public void openAProductPage(){
        productsPage.clickInventoryItemLink();
        Assert.assertTrue(productPage.getItemDetails().contains("Sauce Labs Backpack"));
        productPage.clickBackToProducts();
        productsPage.logoutGeneral();
    }
    @Test(description = "log out the products page")
    public void logOutProductPage(){
        productsPage.clickSideBarMenu();
        productsPage.logOut();
        Assert.assertTrue(loginPage.getLogInButton());
    }


   @Test(description = "use filter")
    public void filterProducts(){
        productsPage.clickFilter();
        Assert.assertTrue(productsPage.getFilter().contains("Name (Z to A)"));
        productsPage.logoutGeneral();
    }
   @Test(description = "add two items to the cart")
    public void addSeveralProducts(){
       productsPage.addToCard3();
       productsPage.addToCard2();
       Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
       productsPage.logoutGeneral();
    }
}
