package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;
import lt.evaldas.pom.pages.Locators;

import java.util.Map;

public class DynamicPropertiesPage {
    public static void open(String url) {
        Common.setUpChrome(3);
        Common.openUrl(url);
    }

    public static void clickOnButtonVisibleAfter() {
        Common.waitElementPresent(Locators.DemoQa.DynamicProperties.buttonVisibleAfter, 8);
        Common.clickOnElement(Locators.DemoQa.DynamicProperties.buttonVisibleAfter);
    }

    public static void clickOnButtonVisibleAfterWithCustomiseWait() {
        Common.waitElementPresentCustomised(Locators.DemoQa.DynamicProperties.buttonVisibleAfter, 8);
        Common.clickOnElement(Locators.DemoQa.DynamicProperties.buttonVisibleAfter);
    }

    public static void checkButtonAttributes() {
        Map<String, ?> attributeResults = Common.getElementAttributes(
                Locators.DemoQa.DynamicProperties.buttonColorChange
        );

        System.out.println(attributeResults);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        attributeResults = Common.getElementAttributes(
                Locators.DemoQa.DynamicProperties.buttonColorChange
        );

        System.out.println(attributeResults);
    }

    public static void clickOnButtonEnableAfter() {
        Common.waitElementClickable(Locators.DemoQa.DynamicProperties.buttonEnableAfter, 8);
        Common.clickOnElement(Locators.DemoQa.DynamicProperties.buttonEnableAfter);
    }

    public static void clickOnButtonColorChange() {
        Common.waitElementAttributeChange(
                Locators.DemoQa.DynamicProperties.buttonColorChange,
                8,
                "class",
                "text-danger"
        );

        Common.clickOnElement(Locators.DemoQa.DynamicProperties.buttonColorChange);
    }
}
