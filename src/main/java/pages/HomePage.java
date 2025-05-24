package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    By TestCaseButton =By.xpath("//*[contains(text(),'Test Cases')]");
    By TestCaseTitle = By.xpath("//*[contains(text(),'Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:')]");
    By SubscriptionTitle = By.xpath("//*[contains(text(),'Subscription')]");
    By SubscriptionEmail = By.id("susbscribe_email");
    By SubmitButton = By.id("subscribe");
    By successMessage = By.xpath("//*[contains(text(),'You have been successfully subscribed!')]");



    public void assertTestCasesExists() {
        myAssertEquals(getText(TestCaseButton, 2), "Test Cases");
        click(TestCaseButton, 5);
        myAssertEquals(getText(TestCaseTitle, 2), "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:");
    }

    public   void homepageopened (){
        myAssertEquals(getText(TestCaseButton, 2), "Test Cases");
    }

    public void scrollToFooter() {
        scrollToElement(SubscriptionTitle);
    }
    public String getSubscriptionTitle() {
        return getText(SubscriptionTitle, 5);
    }
    public void enterEmailAndSubscribe(String email) {
        sendKeys(SubscriptionEmail, 5, email);
        click(SubmitButton, 5);
    }
    public boolean isSuccessMessageDisplayed() {
        return isDisplayed(successMessage, 5);
    }









    By TestCaseButton =By.xpath("//*[contains(text(),'Test Cases')]");
    By TestCaseTitle = By.xpath("//*[contains(text(),'Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:')]");

    public void assertTestCasesExists() {
        myAssertEquals(getText(TestCaseButton, 2), "Test Cases");
        click(TestCaseButton, 5);
        myAssertEquals(getText(TestCaseTitle, 2), "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:");
    }




    //locators
    private final By signupAndLoginLink=By.linkText("Signup / Login");
    private final By signUpAndLogin = By.linkText("Signup / Login");
    private final By homeLink = By.xpath("//a[contains(., 'Home')]");
    private final By loginUser  = By.tagName("b");
    private final By logOut = By.linkText("Logout");
    private final By signUpLogin = By.linkText("Signup / Login");
    private final By homePageAssertion = By.xpath("(//h2[@class='title text-center'])[1]");
    private final By viewProductButton =By.xpath("//a[@href='/product_details/1']");

    private final By contactUsLink=By.linkText("Contact us");

    private final By products = By.xpath("//a[contains(text(), \"Products\")]");


    //methods
    public void verifyHomeLinkIsOrange(String homeColor) {
        WebElement homeElement = webElement(homeLink); // Replaces driver.findElement(homeLink)
        String color = homeElement.getCssValue("color");
        myAssertEquals(color, homeColor);
    }
    public LoginPage clickOnSignUpAndLoginButton()
    {
        click(signUpAndLogin,5);
        return new LoginPage(driver);
    }
    public LoginPage clickOnLogOutButton()
    {
        click(logOut,5);
        return new LoginPage(driver);
    }
    private String getUserName()
    {

        return getText(loginUser , 5);
    }
    public void verifyUserName(String userName)
    {
        myAssertEquals(getUserName(),userName);
    }


    public LoginSignUpPage clickOnSignupAndLogin() {
        click(signupAndLoginLink,5);
        return new LoginSignUpPage(driver);
    }

    public LoginPage clickOnSignUpLoginButton() {

        click(signUpLogin, 30);
        return new LoginPage(driver);
    }

    public String getHomePageMsg() {
        return getText(homePageAssertion,5);

    }

    public ProductDetailPage clickOnViewProductButton () {
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        click(viewProductButton, 30);
        return new ProductDetailPage(driver);


    }

   // public void scrollDown (){
        //Actions actions=new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
//    }

    public ContactUsPage clickContactUsLink() {
        click(contactUsLink, 7);
        return new ContactUsPage(driver);
    }

    public ProductsPage clickOnProducts()
    {
        click(products,5);
        return new ProductsPage(driver);
        return driver.findElement(homePageAssertion).getText();
    }

    public void verifySubscriptionSection(String email) {
        this.homepageopened();
        this.scrollToFooter();
        this.getSubscriptionTitle();
        this.enterEmailAndSubscribe(email);
        this.isSuccessMessageDisplayed();
    }

}

