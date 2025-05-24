package cart;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ShoppingCartPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;
import static utils.MethodHandles.myAssertEquals;

public class CartTest extends BaseTests {

@Test
    public void testProductQuantityInCart () throws FileNotFoundException {

        String actualResultForHomePageAssertion =homePage.getHomePageMsg();
        String expectedResultForHomePageAssertion =dataModel().ExpectedResults.HomePageAssertion;
        Assert.assertEquals(expectedResultForHomePageAssertion,actualResultForHomePageAssertion);
        
        ProductDetailPage productDetailPage = homePage.clickOnViewProductButton();

        String actualResultForDetailPageAssertion = productDetailPage.getAssertMessage();
        String expectedResultForDetailPageAssertion =dataModel().ExpectedResults.ProductDetailAssertion;
        Assert.assertEquals(expectedResultForDetailPageAssertion,actualResultForDetailPageAssertion);


       productDetailPage.increaseQuantityT2O4(dataModel().Quantity.TheFirstProductQuantity);

        productDetailPage.clickOnAddCart();
        ShoppingCartPage shoppingCartPage = productDetailPage.clickOnViewCartLink();

        String actualResultForShoppingPageAssertion = shoppingCartPage.shoppingCartValidationMsg();
        String expectedResultForShoppingPageAssertion =dataModel().ExpectedResults.ShoppingCartAssertion;
        myAssertEquals(expectedResultForShoppingPageAssertion,actualResultForShoppingPageAssertion);


    }
}
