package signUp;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CompleteSignUpPage;
import pages.LoginSignUpPage;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class SignUpTest extends BaseTests {
    @Test
    public void testSignUpNewUser() throws FileNotFoundException, InterruptedException {
        LoginSignUpPage loginSignUpPage=homePage.clickOnSignupAndLogin();
        loginSignUpPage.insertSignupName(dataModel().Signup.SignupValidEmail.Name);
        loginSignUpPage.insertSignUpEmail(dataModel().Signup.SignupValidEmail.Email);
        Thread.sleep(10000);
       CompleteSignUpPage completeSignUpPage =loginSignUpPage.clickOnSignUpButton();
        Thread.sleep(10000);
        completeSignUpPage.scelectMrRadioButton();
        completeSignUpPage.insertPassword(dataModel().SignupFullData.Password);
        completeSignUpPage.selectDayField(dataModel().SignupFullData.Day);
        completeSignUpPage.selectMonthField(dataModel().SignupFullData.Month);
        completeSignUpPage.selectYearField(dataModel().SignupFullData.Year);
        completeSignUpPage.insertFirstName(dataModel().SignupFullData.FirstName);
        completeSignUpPage.insertLastName(dataModel().SignupFullData.LastName);
        completeSignUpPage.insertCompanyField(dataModel().SignupFullData.Company);
        completeSignUpPage.insertAddressField(dataModel().SignupFullData.Address);
        completeSignUpPage.selectCountry(dataModel().SignupFullData.Country);
        completeSignUpPage.insertState(dataModel().SignupFullData.State);
        completeSignUpPage.insertCity(dataModel().SignupFullData.City);
        completeSignUpPage.insertZipCde(dataModel().SignupFullData.ZipCode);
        completeSignUpPage.insertMobileNumber(dataModel().SignupFullData.MobileNumber);
        completeSignUpPage.clickcreateAccount();

    }
}
