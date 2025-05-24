package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ShoppingCartPage extends MethodHandles {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private final By shoppingCartPageAssertion = By.xpath("//div[@class='breadcrumbs']//li[contains(text() ,'Shopping Cart')]");

    public String shoppingCartValidationMsg() {
       return getText(shoppingCartPageAssertion, 30);
    }

    }
