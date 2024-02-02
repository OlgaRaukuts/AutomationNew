import org.testng.Assert;

public class Asserts {
    protected static ProductsPage productsPage = new ProductsPage(Driver.driver);;
    protected static LoginPage loginPage = new LoginPage(Driver.driver);
    protected static ProductPage productPage = new ProductPage(Driver.driver);
    public static void useAssertLogIn(){
        Assert.assertTrue(productsPage.getLogo().contains("Swag Labs"));
    }

    public static void useAssertLogInErr(){
        Assert.assertTrue(loginPage.getErrorMessage().contains("password do not match any user in this service"));
    }

    public static void useAssertForProducts(){





    }
}
