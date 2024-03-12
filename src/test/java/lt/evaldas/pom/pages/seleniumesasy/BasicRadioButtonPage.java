package lt.evaldas.pom.pages.seleniumesasy;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Constant;
import lt.evaldas.pom.pages.Locators;

public class BasicRadioButtonPage {

    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnRadioButtonOptradio(Constant.BasicRadioButton value) {
        Common.clickOnElement(Locators.SeleniumEasy.BasicRadioButton.setRadioButtonOptradio(value));
    }

    public static void clickOnButtonGetCheckedValue() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicRadioButton.buttonGetCheckValue);
    }

    public static String readCheckedValue() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicRadioButton.paragrapheGetCheckedValue);
    }

    public static void clickOnGenderButton(String gender) {
        Common.clickOnElement(Locators.SeleniumEasy.BasicRadioButton.setRadoButtonGender(gender));
    }

    public static void clickOnAgeButton(String age) {
        Common.clickOnElement(Locators.SeleniumEasy.BasicRadioButton.setRadioButtonAgeGroup(age));
    }

    public static void pressButtonGetValue() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicRadioButton.buttonGetValues);
    }

    public static String readMessageOfRadioButtonGroup() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicRadioButton.paragraphGetGroupValues);
    }
}
