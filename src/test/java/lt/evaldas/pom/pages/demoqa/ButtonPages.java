package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;

public class ButtonPages {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void doubleClickOnButton() {
        Common.doubleClickOnElementByAction(Locators.DemoQa.Buttons.buttonDoubleClick);
    }

    public static String readDoubleClickMessage() {
        return Common.getTextFromElement(Locators.DemoQa.Buttons.paragraphDoubleClickMessage);
    }
}
