import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest{
    @Test (description = "add a product to the cart")
    public void addProduct(){
        productsPage.addToCard();
        Assert.assertTrue(productsPage.getRemoveButton2().contains("Remove"));

    }
    @Test(description = "open a product page")
    public void openAProductPage(){
        productsPage.clickInventoryItemLink();
        Assert.assertTrue(productPage.getItemDetails().contains("Sauce Labs Backpack"));
        productPage.clickBackToProducts();
    }

   @Test(description = "use filter")
    public void filterProducts(){
        productsPage.clickFilter();
        Assert.assertTrue(productsPage.getFilter().contains("Name (Z to A)"));
    }
   @Test(description = "add two items to the cart")
    public void addSeveralProducts(){
       productsPage.addToCard3();
       productsPage.addToCard2();
       Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
    }
}
