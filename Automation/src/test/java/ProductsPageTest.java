import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest{
    public ProductsPage productsPage;
    public LoginPage loginPage;
    public ProductPage productPage;
    @Test (description = "add a product to the cart")
    public void addProduct(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.addToCard();
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
    }
    @Test(description = "open a product page")
    public void openAProductPage(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        productsPage.clickInventoryItemLink();
        Assert.assertTrue(productPage.getItemDetails().contains("Sauce Labs Backpack"));
    }
    @Test(description = "log out the products page")
    public void logOutProductPage(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickSideBarMenu();
        productsPage.logOut();
        Assert.assertTrue(loginPage.getLogInButton());
    }
    @Test(description = "use filter")
    public void filterProducts(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickFilter();
        Assert.assertTrue(productsPage.getFilter().contains("Name (Z to A)"));
    }
    @Test(description = "add two items to the cart")
    public void addSeveralProducts(){
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.addToCard();
        productsPage.addToCard2();
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
    }
}
