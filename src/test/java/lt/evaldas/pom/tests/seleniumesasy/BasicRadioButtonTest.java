package lt.evaldas.pom.tests.seleniumesasy;

import lt.evaldas.pom.pages.Constant;
import lt.evaldas.pom.pages.seleniumesasy.BasicRadioButtonPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicRadioButtonTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicRadioButtonPage.open("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @DataProvider(name = "dataProviderOptradioGender")
    public Object[][] dataDataOptradioGender() {
        return new Object[][]{
                {Constant.BasicRadioButton.MALE, "Male"},
                {Constant.BasicRadioButton.FEMALE, "Female"},
        };
    }

    @Test(dataProvider = "dataProviderOptradioGender")
    public void testRadioButtonOfOptradioClickedOn(Constant.BasicRadioButton inputGender, String expectedResult) {
        String actualResult;

        BasicRadioButtonPage.clickOnRadioButtonOptradio(inputGender);
        BasicRadioButtonPage.clickOnButtonGetCheckedValue();
        actualResult = BasicRadioButtonPage.readCheckedValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @DataProvider(name = "dataProviderGroupButtonGender")
    public Object[][] dataProviderGroupButtonGender() {
        return new Object[][]{
                {"Female", "0 - 5", "Female", "0 - 5"},
                {"Female", "5 - 15", "Female", "5 - 15"},
                {"Female", "15 - 50", "Female", "15 - 50"},
                {"Male", "0 - 5", "Male", "0 - 5"},
                {"Male", "5 - 15", "Male", "5 - 15"},
                {"Male", "15 - 50", "Male", "15 - 50"},
        };
    }

    @Test(dataProvider = "dataProviderGroupButtonGender")
    public void testRadioButtonOfGroupButtonGender(String inputGender, String inputAgeGroup, String expectedGender, String expectedAgeGroup) {
        String actualResult;

        BasicRadioButtonPage.clickOnGenderButton(inputGender);
        BasicRadioButtonPage.clickOnAgeButton(inputAgeGroup);
        BasicRadioButtonPage.pressButtonGetValue();
        actualResult = BasicRadioButtonPage.readMessageOfRadioButtonGroup();

        Assert.assertTrue(
                actualResult.contains(expectedGender) && actualResult.contains(expectedAgeGroup),
                "\nExpectedGender: %s,\nExpectedAgeGroup: %s,\nActual: %s\n".formatted(
                        expectedGender, expectedAgeGroup, actualResult
                )
        );
    }
}
