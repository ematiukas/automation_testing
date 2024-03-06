package lt.evaldas.pom.pages.seleniumesasy;

import lt.evaldas.pom.pages.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicFirstFormPage {
    public static void open(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void close() {

    }

    public static void writeMessage(String message) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='user-message']"), message
        );
    }

    public static void clickOnButtonShowMessage() {
        Common.clickOnElement(By.xpath("//button[@onclick='showInput();']"));
    }

    public static String readMessage() {
        return Common.getTextFromElement(By.xpath("//span[@id='display']"));
    }

    public static void writeValueA(String value) {
        Common.sendKeysToElement(By.xpath("//input[@id='value1']"), value);
    }

    public static void writeValueB(String value) {
        Common.sendKeysToElement(By.xpath("//input[@id='value2']"), value);
    }

    public static void clickOnButtonGetTotal() {
        Common.clickOnElement(By.xpath("//*[@id='gettotal']//button"));
    }

    public static String readSumTotal() {
        return Common.getTextFromElement(By.xpath("//span[@id='displayvalue']"));
    }
}
