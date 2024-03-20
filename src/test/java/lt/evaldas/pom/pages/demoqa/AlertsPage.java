package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;

public class AlertsPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnButtonAlert() {
        Common.clickOnElement(Locators.DemoQa.Alerts.buttonAlert);
    }
    public static void acceptAlert() {
        if ( Common.waitAlertPresent(7)) {
            Common.acceptAlert();
        }
    }

    public static void clickOnButtonTimerAlert() {
        Common.clickOnElement(Locators.DemoQa.Alerts.buttonTimerAlert);
    }

    public static void clickOnButtonConfirmAlert() {
        Common.clickOnElement(Locators.DemoQa.Alerts.buttonConfirmAlert);
    }

    public static String readMessageConfirmAlert() {
        return Common.getTextFromElement(Locators.DemoQa.Alerts.spanConfirmResult);
    }

    public static void cancelAlert() {
        if(Common.waitAlertPresent(7)){
            Common.cancelAlert();
        }
    }

    public static void clickOnButtonPromtAlert() {
        Common.clickOnElement(Locators.DemoQa.Alerts.buttonPromt);
    }

    public static void writeTextToAlert(String input) {
        if(Common.waitAlertPresent(7)){
            Common.sendKeysToAlert(input);
        }
    }

    public static String readMessagePromtAlert() {
        return Common.getTextFromElement(Locators.DemoQa.Alerts.spanPromtResult);
    }
}
