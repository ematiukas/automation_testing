package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;
import org.openqa.selenium.By;

public class TextBoxPage {
    public static void open(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void close() {
        Common.quitChromeDriver();
    }

    public static void closeConsent() {
        boolean isElementVisible = Common.waitElementVisible(By.xpath("//p[text()='Consent']"), 8);

        if (isElementVisible) {
            Common.clickOnElement(By.xpath("//p[text()='Consent']"));
        }
    }

    public static void enterFullName(String inputFullName) {
    }
}
