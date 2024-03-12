package lt.evaldas.pom.tests.seleniumesasy;

import lt.evaldas.pom.pages.Constant;
import lt.evaldas.pom.pages.seleniumesasy.BasicRadioButtonPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicRadioButtonTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicRadioButtonPage.open("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @Test
    public void testRadioButtonOfOptradioClickedOnMale() {
        String expectedResult = "Male";
        String actualResult;

        BasicRadioButtonPage.clickOnRadioButtonOptradio(Constant.BasicRadioButton.MALE);

        BasicRadioButtonPage.clickOnButtonGetCheckedValue();

        actualResult = BasicRadioButtonPage.readCheckedValue();

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
            );
        }
    @Test
    public void testRadioButtonOfOptradioClickedOnFemale() {
        String expectedResult = "Female";
        String actualResult;

        BasicRadioButtonPage.clickOnRadioButtonOptradio(Constant.BasicRadioButton.FEMALE);
        BasicRadioButtonPage.clickOnButtonGetCheckedValue();
        actualResult = BasicRadioButtonPage.readCheckedValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testRadioButtonOfGroupButtonGender() {
        String inputGender = "Male";
        String inputAgeGroup = "5 - 15";
        String expectedGender = "Male";
        String expectedAgeGroup = "5 - 15";
        String actualResult;

        BasicRadioButtonPage.clickOnGenderButton(inputGender);
        BasicRadioButtonPage.clickOnAgeButton(inputAgeGroup);
        BasicRadioButtonPage.pressButtonGetValue();
        actualResult =  BasicRadioButtonPage.readMessageOfRadioButtonGroup();

        Assert.assertTrue(
                actualResult.contains(expectedGender) && actualResult.contains(expectedAgeGroup),
                "\nExpectedGender: %s,\nExpectedAgeGroup: %s,\nActual: %s\n".formatted(
                        expectedGender,expectedAgeGroup, actualResult
                )
        );
    }
}
