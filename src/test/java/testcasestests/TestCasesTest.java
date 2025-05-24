package testcasestests;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestCasesTest extends BaseTests {

    @Test
    public void ClickTester() {

        homePage.assertTestCasesExists();
    }
}
