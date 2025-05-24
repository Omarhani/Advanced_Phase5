package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginSignUpPage extends MethodHandles {

    private final By Email=By.cssSelector("input[data-qa='signup-email']");
    private final By name=By.name("name");
    private final By signUpButton=By.cssSelector("button[data-qa='signup-button']");

    public LoginSignUpPage(WebDriver driver) {
        super(driver);
    }

    public void insertSignUpEmail(String text){
        sendKeys(Email,5,text);
    }
    public void insertSignupName(String text){
        sendKeys(name,5,text);
    }
    public CompleteSignUpPage clickOnSignUpButton(){
        click(signUpButton,5);
        return new CompleteSignUpPage(driver);
    }
}
