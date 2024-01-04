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
}
