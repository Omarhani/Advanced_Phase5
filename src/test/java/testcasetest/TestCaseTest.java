package testcasetest;

import base.BaseTests;
import org.testng.annotations.Test;

public class TestCaseTest extends BaseTests {

    @Test
    public void ClickTester() {

        homePage.assertTestCasesExists();
    }
}
