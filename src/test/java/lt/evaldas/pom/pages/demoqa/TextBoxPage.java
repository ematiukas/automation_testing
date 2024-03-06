package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;
import org.openqa.selenium.By;

public class TextBoxPage {
    public static void open(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void closeConsent() {
        boolean isElementVisible = Common.waitElementVisible(Locators.DemoQa.TextBox.paragraphConsent, 8);

        if (isElementVisible) {
            Common.clickOnElement(Locators.DemoQa.TextBox.paragraphConsent);
        }
    }

    public static void enterFullName(String inputFullName) {
    }
}
