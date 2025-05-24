package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.MethodHandles;

import java.security.PublicKey;

public class ProductDetailPage extends MethodHandles {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    private final By assertOnProductDetail = By.xpath("//div[@class='col-sm-3']//h2[contains(text(), 'Category')]");
    private final By quantityTextBox = By.xpath("//input[@id='quantity']");
    private final By addCartButton = By.xpath("//button[@type='button']");
    private final By viewCartLink = By.xpath("//div[@id='cartModal']//u[contains(text() ,'View Cart')]");


    public String getAssertMessage() {
        return getText(assertOnProductDetail, 30);
    }

    //public void increaseQuantityTO4() {
        //clear(quantityTextBox, 30);
        //sendKeys(quantityTextBox, 30, "4");
    //}

    public void increaseQuantityT2O4(String quantity) {
        clear(quantityTextBox, 30);
        sendKeys(quantityTextBox, 30,quantity);
    }

    public void clickOnAddCart() {
        click(addCartButton, 30);
    }

    public ShoppingCartPage clickOnViewCartLink() {
        click(viewCartLink, 30);
        return new ShoppingCartPage(driver);

    }


   }



