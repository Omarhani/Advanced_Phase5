package contactUs;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import java.io.FileNotFoundException;
import static org.testng.Assert.assertTrue;
import static reader.ReadDataFromJson.dataModel;

public class ContactUsTests extends BaseTests {
    @Test
    public void testContactUs() throws FileNotFoundException {
        ContactUsPage contactUsPage=homePage.clickContactUsLink();
        assertTrue(contactUsPage.getContactUsPageTitle().equalsIgnoreCase("Get In Touch"));
        contactUsPage.ContactUs(dataModel().Contactus.Name,dataModel().Contactus.Email,dataModel().Contactus.Subject,dataModel().Contactus.Message,dataModel().Contactus.FilePath);
        assertTrue(contactUsPage.getContactUsSuccessMessage().contains("Success! Your details have been submitted successfully."));
    }
}
