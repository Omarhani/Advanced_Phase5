package product;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;
import static utils.MethodHandles.myAssertEquals;
import static utils.MethodHandles.myAssertTrue;


public class ProductTests extends BaseTests {
    @Test
    public void addProductsInCart() throws FileNotFoundException {
        homePage.verifyHomeLinkIsOrange(dataModel().HomeColor);
        LoginPage loginPage = homePage.clickOnSignUpAndLoginButton();
        loginPage.insertLoginCreditial(dataModel().Login.ValidCreditials.Email,dataModel().Login.ValidCreditials.Password);
        homePage = loginPage.clickOnLoginButton();
        ProductsPage productsPage = homePage.clickOnProducts();
        productsPage.addTwoProductsToCart();
        CartPage cartPage = productsPage.clickOnViewCartButton();
        cartPage.verifyTwoProductsExistingOnCart();
        CheckoutPage checkoutPage = cartPage.clickOnProceedToCheckoutButton();
        checkoutPage.verifyQuantityForTwoProducts(dataModel().Quantities.FirstProductQuantity,dataModel().Quantities.SecondProductQuantity);
        checkoutPage.verifyPriceForTwoProducts(dataModel().Prices.FirstProductPrice,dataModel().Prices.SecondProductPrice);
        checkoutPage.verifyTotalPrice(dataModel().Prices.TotalPrice);
        cartPage.deleteTwoProducts();



    }
    @Test
    public void verifyAllProductsAndProductDetailPage() throws FileNotFoundException
    {
        myAssertEquals(homePage.getHomePageMsg(),dataModel().ExpectedResults.HomePageAssertion);
        ProductsPage productsPage = homePage.clickOnProducts();
        myAssertEquals(productsPage.getAllProductsText(),dataModel().ExpectedResults.ProductPageAssertion);
        myAssertTrue(productsPage.isProductListVisible());
        ProductDetailPage productDetailPage = productsPage.clickOnFirstViewProductButton();
        myAssertEquals(productDetailPage.getProductName(), dataModel().ProductDetails.Name);
        myAssertEquals(productDetailPage.getCategory(), dataModel().ProductDetails.Category);
        myAssertEquals(productDetailPage.getPrice(), dataModel().ProductDetails.Price);
        myAssertTrue(productDetailPage.getAvailability().contains(dataModel().ProductDetails.Availability));
        myAssertTrue(productDetailPage.getCondition().contains(dataModel().ProductDetails.Condition));
        myAssertTrue(productDetailPage.getBrand().contains(dataModel().ProductDetails.Brand));


    }
}
