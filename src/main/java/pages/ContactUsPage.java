package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ContactUsPage extends MethodHandles {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    //define locators
private final By contactUsPageTitle= By.xpath("//h2[contains(text(),'Get In Touch')]");
private final By contactUsNameField= By.name("name");
private final By EmailField=By.name("email");
private final By contactUsSubjectField=By.name("subject");
private final By contactUsMessageField=By.name("message");
private final By contactUsUploadFile=By.name("upload_file");
private final By contactUsSubmitButton=By.name("submit");
private final By contactUsSuccessMessage=By.cssSelector(".contact-form");


//add func
public String  getContactUsPageTitle(){
return getText(contactUsPageTitle,5);
}
public void insertContactUsName(String name){
sendKeys(contactUsNameField,5,name);
}

public void insertContactUsEmail(String email){
        sendKeys(EmailField,5,email);
    }
    public void insertContactUsSubject(String subject){
    sendKeys(contactUsSubjectField,5,subject);
    }
    public void insertContactUsMessage(String message){
        sendKeys(contactUsMessageField,5,message);
    }
    public void uploadFile(String filePath){
sendKeys(contactUsUploadFile,5,filePath);
    }
    public void clickOnSubmitButton(){
      click(contactUsSubmitButton,5);
    }
    public void acceptContactUsAlert(){
        acceptAlert();
    }
    public String getContactUsSuccessMessage(){
    return getText(contactUsSuccessMessage,7);
    }
    public void ContactUs(String name,String email,String subject,String message,String filePath){
    insertContactUsName(name);
    insertContactUsEmail(email);
    insertContactUsSubject(subject);
    insertContactUsMessage(message);
    uploadFile(filePath);
    clickOnSubmitButton();
    acceptContactUsAlert();

    }
}