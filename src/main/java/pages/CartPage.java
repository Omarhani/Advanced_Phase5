package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.MethodHandles;

public class CartPage extends MethodHandles {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private final By blueTop = By.xpath("//h4/a[text()=\"Blue Top\"]");
    private final By menTShirt = By.xpath("//h4/a[text()=\"Men Tshirt\"]");
    private final By proceedToCheckoutButton = By.xpath("//a[contains(text(),\"Proceed To Checkout\")]");
    private final By deleteFirstProductButton= By.xpath("(//a[@class=\"cart_quantity_delete\"])[1]");
    private final By deleteSecondProductButton= By.xpath("(//a[@class=\"cart_quantity_delete\"])[2]");

    //Methods
    public void verifyTwoProductsExistingOnCart()
    {
        WebElement blueTopElement = webElement(blueTop);
        WebElement menTShirtElement = webElement(menTShirt);
        boolean firstProductIsDisplayed = blueTopElement.isDisplayed();
        boolean secondProductIsDisplayed = menTShirtElement.isDisplayed();
        myAssertTrue(firstProductIsDisplayed);
        myAssertTrue(secondProductIsDisplayed);
    }
    public CheckoutPage clickOnProceedToCheckoutButton()
    {
        click(proceedToCheckoutButton,5);
        return new CheckoutPage(driver);
    }
    public void deleteTwoProducts()
    {
        click(deleteFirstProductButton,5);
        click(deleteSecondProductButton,5);
    }

}
