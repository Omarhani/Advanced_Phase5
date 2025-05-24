package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsPage extends MethodHandles {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    private final By firstProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
    private final By secondProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[2]");
    private final By addToCartFirstProduct = By.xpath("(//p[text()='Blue Top']/parent::div//a[contains(@class, 'add-to-cart')])[2]");
    private final By addToCartSecondProduct = By.xpath("(//p[text()='Men Tshirt']/parent::div//a[contains(@class, 'add-to-cart')])[2]");
    private final By continueShoppingButton = By.xpath("//button[contains(text(),\"Continue Shopping\")]");
    private final By viewCartButton = By.xpath("//a[u[text()=\"View Cart\"]]");

    //methods
   private void hoverForFirstProduct()
    {
        smoothScrollToElement(firstProduct);
        click(firstProduct,5);
    }
    private void hoverForSecondProduct()
    {
        click(secondProduct,5);
    }
    private void clickOnAddToCartFirstProduct()
    {
        click(addToCartFirstProduct,5);
    }
    private void clickOnAddToCartSecondProduct()
    {
        click(addToCartSecondProduct,5);
    }
    private void clickOnContinueShoppingButton()
    {
        click(continueShoppingButton,5);
    }
    public void addTwoProductsToCart() {
        hoverForFirstProduct();
        clickOnAddToCartFirstProduct();
        clickOnContinueShoppingButton();
        hoverForSecondProduct();
        clickOnAddToCartSecondProduct();
    }
    public CartPage clickOnViewCartButton()
    {
        click(viewCartButton,5);
        return new CartPage(driver);
    }

}
