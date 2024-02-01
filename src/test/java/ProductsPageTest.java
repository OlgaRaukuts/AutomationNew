import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductsPageTest extends BaseTest{
    @Test (description = "add a product to the cart", priority = 2)
    public void addProduct(){
        productsPage.addToCard();
        productsPage.waitTheElementTest1(Duration.ofSeconds(10));
        Assert.assertTrue(productsPage.getRemoveButton2().contains("Remove"));
        //Driver.log.info("the product was successfully added");

    }
    @Test(description = "open a product page", priority = 1)
    public void openAProductPage(){
        productsPage.clickInventoryItemLink();
        productPage.waitTheElementProductPage(Duration.ofSeconds(10));
        Assert.assertTrue(productPage.getItemDetails().contains("Sauce Labs Backpack"));
        productPage.clickBackToProducts();
        //Driver.log.info("The product page was opened");
    }

    @Test(description = "use filter", priority = 3)
    public void filterProducts(){
        productsPage.clickFilter();
        productsPage.waitTheElementFilter(Duration.ofSeconds(10));
        Assert.assertTrue(productsPage.getFilter().contains("Name (Z to A)"));
        //Driver.log.info(" The filter was used successfully");
    }
    @Test(description = "add two items to the cart", priority = 4)
    public void addSeveralProducts(){
        productsPage.addToCard3();
        productsPage.addToCard2();
        productsPage.waitTheElementRemoveBtn(Duration.ofSeconds(10));
        Assert.assertTrue(productsPage.getRemoveButton().contains("Remove"));
        //Driver.log.info("Two items were added to the cart");
    }
}