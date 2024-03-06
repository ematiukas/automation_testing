package lt.evaldas.pom.pages.seleniumesasy;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;
import org.openqa.selenium.By;

public class  BasicFirstFormPage {
    public static void open(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }


    public static void writeMessage(String message) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.BasicFirstForm.inputUserMessage, message
        );
    }

    public static void clickOnButtonShowMessage() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicFirstForm.buttonShowMessage);
    }

    public static String readMessage() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplayMessage);
    }

    public static void writeValueA(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.BasicFirstForm.inputValue1, value);
    }

    public static void writeValueB(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.BasicFirstForm.inputValue2, value);
    }

    public static void clickOnButtonGetTotal() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicFirstForm.buttonGetTotal);
    }

    public static String readSumTotal() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplayValues);
    }
}
