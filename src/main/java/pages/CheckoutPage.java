package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckoutPage extends MethodHandles {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private final By firstPrice = By.xpath("(//td[contains(@class, 'cart_price')]//p[contains(text(), 'Rs.')])[1]");
    private final By secondPrice = By.xpath("(//td[contains(@class, 'cart_price')]//p[contains(text(), 'Rs.')])[2]");
    private final By firstQuantity = By.xpath("(//td[contains(@class, 'cart_quantity')]/button)[1]");
    private final By secondQuantity = By.xpath("(//td[contains(@class, 'cart_quantity')]/button)[2]");
    private final By totalPrice = By.xpath("(//p[@class='cart_total_price'])[last()]");
    private final By cartButton = By.xpath("//a[contains(text(), \" Cart\")]");


    //Methods
    public void verifyPriceForTwoProducts(String price1 ,String price2)
    {
        smoothScrollToElement(firstPrice);
        String actualFirstPrice = getText(firstPrice,5);
        String actualSecondPrice = getText(secondPrice,5);
        myAssertEquals(actualFirstPrice,price1);
        myAssertEquals(actualSecondPrice,price2);
    }
    public void verifyQuantityForTwoProducts(String quantity1, String quantity2) {
        String actualFirstQuantity = getText(firstQuantity,5);
        String actualSecondQuantity = getText(secondQuantity,5);

        myAssertEquals(actualFirstQuantity, quantity1);
        myAssertEquals(actualSecondQuantity, quantity2);
    }

    public CartPage verifyTotalPrice(String expectedTotalPrice) {
        String actualTotalPrice = getText(totalPrice,5);
        myAssertEquals(actualTotalPrice, expectedTotalPrice);
        smoothScrollToElement(cartButton);
        click(cartButton,5);
        return new CartPage(driver);
    }



}
