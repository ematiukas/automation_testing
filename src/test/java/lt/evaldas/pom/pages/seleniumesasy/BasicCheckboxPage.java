package lt.evaldas.pom.pages.seleniumesasy;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;

public class BasicCheckboxPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnCheckboxIsAgeSelected() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicCheckbox.checkboxIsAgeSelected);
    }

    public static String readMessageCheckboxIsCheck() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicCheckbox.divTextAge);
    }

    public static boolean isCheckboxSelected() {
        return Common.isElementSelected(Locators.SeleniumEasy.BasicCheckbox.checkboxDefaultSelected);
    }

    public static boolean isCheckboxEnabled() {
        return Common.isElementEnabled(Locators.SeleniumEasy.BasicCheckbox.checkboxDefaultDisabled);
    }
}
