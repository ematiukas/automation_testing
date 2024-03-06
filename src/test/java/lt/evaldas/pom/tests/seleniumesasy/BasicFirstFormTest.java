package lt.evaldas.pom.tests.seleniumesasy;

import lt.evaldas.pom.pages.seleniumesasy.BasicFirstFormPage;
import lt.evaldas.pom.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFirstFormTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        BasicFirstFormPage.open("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    public void openBasicFirstFormPageFor3sec() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSingleImputField() {

        String input = "Hello World!";
        String expectedResult = "Hello World!";
        String actualResult = null;

        BasicFirstFormPage.writeMessage(input);
        BasicFirstFormPage.clickOnButtonShowMessage();
        actualResult = BasicFirstFormPage.readMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testTwoImputField() {

        String input1 = "5";
        String input2 = "5";
        String expectedSumTotal = "10";
        String actualSumTotal;

        BasicFirstFormPage.writeValueA(input1);
        BasicFirstFormPage.writeValueB(input2);
        BasicFirstFormPage.clickOnButtonGetTotal();
        actualSumTotal = BasicFirstFormPage.readSumTotal();

        Assert.assertEquals(actualSumTotal, expectedSumTotal);
    }

    @Test
    public void testNegativeTwoImputField() {

        String input1 = "5";
        String input2 = "aaa";
        String expectedSumTotal = "NaN";
        String actualSumTotal;

        BasicFirstFormPage.writeValueA(input1);
        BasicFirstFormPage.writeValueB(input2);
        BasicFirstFormPage.clickOnButtonGetTotal();
        actualSumTotal = BasicFirstFormPage.readSumTotal();


        Assert.assertEquals(actualSumTotal, expectedSumTotal);
    }
}
