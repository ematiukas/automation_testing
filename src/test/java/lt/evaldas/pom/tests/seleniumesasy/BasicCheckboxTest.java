package lt.evaldas.pom.tests.seleniumesasy;

import lt.evaldas.pom.pages.Locators;
import lt.evaldas.pom.pages.seleniumesasy.BasicCheckboxPage;
import lt.evaldas.pom.pages.seleniumesasy.BasicFirstFormPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicCheckboxTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        BasicCheckboxPage.open("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void testGivenUncheckbox_whenSingleCheckboxContainer_thenAppearMessageCheckboxIsChecked() {
        String expectedResult = "Check box is checked";
        String actualResult = null;

        BasicCheckboxPage.clickOnCheckboxIsAgeSelected();
        actualResult = BasicCheckboxPage.readMessageCheckboxIsCheck();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testIfDefaultCheckboxIsSelected(){
        boolean expectedResult = true;
        boolean actualResult;

        actualResult = BasicCheckboxPage.isCheckboxSelected();

        Assert.assertTrue(actualResult = expectedResult);
    }
    @Test
    public void testIfDefaultCheckboxIsDisabled(){
        boolean actualResult;

        actualResult = BasicCheckboxPage.isCheckboxEnabled();

        Assert.assertFalse(actualResult);
    }
}
