package lt.evaldas.pom.tests.demoqa;

import lt.evaldas.pom.pages.demoqa.AlertsPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AlertsPage.open("https://demoqa.com/alerts");
    }

    @Test
    public void testAlert() {
        AlertsPage.clickOnButtonAlert();
        AlertsPage.acceptAlert();
    }

    @Test
    public void testConfirmAlertClickCancel() {
        String expectedResult = "Cancel";
        String actualResult = null;

        AlertsPage.clickOnButtonConfirmAlert();
        AlertsPage.cancelAlert();
        actualResult = AlertsPage.readMessageConfirmAlert();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testTimerAlert() {
        AlertsPage.clickOnButtonTimerAlert();
        AlertsPage.acceptAlert();
    }

    @Test
    public void testConfirmAlertClickAccept() {
        String expectedResult = "Ok";
        String actualResult = null;

        AlertsPage.clickOnButtonConfirmAlert();
        AlertsPage.acceptAlert();
        actualResult = AlertsPage.readMessageConfirmAlert();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testPromtAlertWriteText() {
        String input = "Evaldas";
        String expectedResult = "Evaldas";
        String actualResult = null;

        AlertsPage.clickOnButtonPromtAlert();
        AlertsPage.writeTextToAlert(input);
        AlertsPage.acceptAlert();
        actualResult = AlertsPage.readMessagePromtAlert();          //keturi zingsniai

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

}
