package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CompleteSignUpPage extends MethodHandles {
    public CompleteSignUpPage(WebDriver driver) {
        super(driver);
    }
    private final By signUpValidationMessage=By.xpath("//*[contains(text(),'Enter Account Information')]");
    private final By mrRadioButton=By.id("id_gender1");
    private final By msRadioButton=By.cssSelector("input[value='Mrs']");
    private final By password=By.id("password");
    private final By dayField=By.cssSelector("#days");
    private final By monthField=By.cssSelector("#months");
    private final By yearField=By.cssSelector("#years");
    private final By firstName=By.id("first_name");
    private final By lastName=By.id("last_name");
    private final By company=By.id("company");
    private final By address=By.cssSelector("#address1");
    private final By countryField=By.cssSelector("#country");
    private final By stateField=By.cssSelector("#state");
    private final By cityField=By.cssSelector("#city");
    private final By zipCodeField=By.cssSelector("#zipcode");
    private final By mobileNumber=By.cssSelector("#mobile_number");
    private final By createAccount=By.cssSelector("button[data-qa='create-account']");
    private final By signUpInvalidEmailValidationMessage=By.xpath("//p[contains(text(),'Email Address already exist!')]");

    public String getSignUpValidationMessage(){
        return getText(signUpValidationMessage,5);
    }
    public void scelectMrRadioButton(){
        click(mrRadioButton,5);
    }
    public void scelectMs(){
        click(msRadioButton,5);
    }
    public void insertPassword(String text){
        sendKeys(password,5,text);
    }
    public void selectDayField(String value){
        selectByValue(dayField,5,value);
    }
    public void selectMonthField(String value){
        selectByValue(monthField,5,value);
    }
    public void selectYearField(String value){
        selectByValue(yearField,5,value);
    }
    public void insertFirstName(String text) {
        sendKeys( firstName,5, text);
    }
    public void insertLastName(String text) {
        sendKeys(lastName,5, text);
    }
    public void insertCompanyField(String text) {
        sendKeys( company,5,text);
    }
    public void insertAddressField(String text) {
        sendKeys( address,5,text);
    }
    public void insertState(String text) {
        sendKeys(stateField, 5,text);
    }
    public void insertCity(String text) {
        sendKeys(cityField,5,text);
    }
    public void insertZipCde(String text) {
        sendKeys( zipCodeField,5, text);
    }
    public void insertMobileNumber(String text) {
        sendKeys( mobileNumber,5, text);
    }
    public void selectCountry(String value){
        selectByValue(countryField,5,value);
    }
    public void clickcreateAccount(){
        click(createAccount,5);
    }
    public String getInvallidSsignUpIValidationMessage(){
        return getText(signUpInvalidEmailValidationMessage,5);
    }
}

