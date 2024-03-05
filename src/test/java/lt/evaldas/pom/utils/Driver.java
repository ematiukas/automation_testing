package lt.evaldas.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static WebDriver chromeDriver;
    public static void setUpChrome() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("--headless=new");
//        options.addArguments("window-size=5000,3000");

        chromeDriver = new ChromeDriver(options);
        chromeDriver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static WebDriver getChromeDriver() {
        return chromeDriver;
    }

    public static void quitChromeDriver(){
        chromeDriver.quit();
    }
}
