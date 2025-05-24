package subscriptionTests;

import base.BaseTests;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class SubscriptionTestCase extends BaseTests {

    @Test
    public void HomePageOpened() throws FileNotFoundException {

        homePage.verifySubscriptionSection(dataModel().SubscriptionEmail);
    }
}

