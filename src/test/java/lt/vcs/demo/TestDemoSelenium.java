package lt.vcs.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDemoSelenium {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("--headless=new");
//        options.addArguments("window-size=5000,3000");

        driver = new ChromeDriver(options);
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Test
    public void testOpenSeleniumEasy() {

        for (String typeName : driver.manage().logs().getAvailableLogTypes()) {
            System.out.println("\n\u001B[35m*** TYPE NAME: " + typeName + " ***\u001B[0m\n");
            for (LogEntry logEntry : driver.manage().logs().get(typeName).getAll()) {
                System.out.println(logEntry);
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testSingleImputField() {

        String input = "Hello World!";
        String expectedResult = "Hello World!";
        String actualResult = null;

        WebElement inputUserMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputUserMessage.sendKeys(input);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        buttonShowMessage.click();

        WebElement spanDisplayMessage = driver.findElement(By.xpath("//span[@id='display']"));
        actualResult = spanDisplayMessage.getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
    @Test
    public void testTwoImputField() {

        String input1 = "123";
        String input2 = "456";
        String expectedResult = "579";
        String actualResult = null;

        WebElement inputUserMessage1 = driver.findElement(By.xpath("//input[@id='value1']"));
        inputUserMessage1.sendKeys(input1);

        WebElement inputUserMessage2 = driver.findElement(By.xpath("//input[@id='value2']"));
        inputUserMessage2.sendKeys(input2);

        WebElement buttonShowSum = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        buttonShowSum.click();

        WebElement spanDisplayValue = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = spanDisplayValue.getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
