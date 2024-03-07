package lt.evaldas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy{
        public static class BasicFirstForm{

            public static By inputUserMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
            public static By spanDisplayMessage = By.xpath("//span[@id='display']");
            public static By inputValue1 = By.xpath("//input[@id='value1']");
            public static By inputValue2 = By.xpath("//input[@id='value2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By spanDisplayValues = By.xpath("//span[@id='displayvalue']");
        }

        public static class BasicCheckbox{

            public static By checkboxIsAgeSelected = (By.xpath("//input[@id='isAgeSelected']"));
            public static By divTextAge = By.xpath("//div[@id='txtAge']");
            public static By checkboxDefaultSelected =
                    By.xpath("(//input[@id='isAgeSelected']/../..//input)[2]");
            public static By checkboxDefaultDisabled =
                    By.xpath("(//input[@id='isAgeSelected']/../..//input)[3]");
        }
    }

    public static class DemoQa{
        public static class TextBox{

            public static By paragraphConsent = By.xpath("//p[text()='Consent']");
        }
    }
}
