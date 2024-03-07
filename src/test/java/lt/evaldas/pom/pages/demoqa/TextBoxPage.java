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

    public static void writeFullName(String inputFullName) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='userName']"), inputFullName   //geriau ID
        );
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(By.xpath("//button[@id='submit']"));
    }

    public static String readActualFullName() {
        return Common.getTextFromElement(By.xpath("//p[@id='name']"));
    }

    public static void writeMessageEmail(String inputEmail) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='userEmail']"), inputEmail);
    }

    public static String readActualEmail() {
        return Common.getTextFromElement(By.xpath("//p[@id='email']"));
    }
}
