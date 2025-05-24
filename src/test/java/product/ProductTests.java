package product;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

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
}
