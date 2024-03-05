package lt.evaldas.pom.pages;

import lt.evaldas.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChrome();
    }

    public static void setUpChrome(int waitSeconds) {
        Driver.setUpChrome();
        Driver.getChromeDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitSeconds));
    }
    public static void openUrl(String url) {
        Driver.getChromeDriver().get(url);
    }

    public static void quitChromeDriver(){
        Driver.quitChromeDriver();
    }

    private static WebElement getElement(By locator){
        return Driver.getChromeDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator){
        return Driver.getChromeDriver().findElements(locator);
    }
        public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }
}
