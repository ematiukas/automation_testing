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
            public static By buttonSelectAll = By.xpath("//input[@id='check1']");
            public static By checkboxGroup = By.xpath("//input[@class ='cb1-element']");
        }

        public static class BasicRadioButton {
            public static By buttonGetCheckValue = By.xpath("//button[@id='buttoncheck']");
            public static By paragrapheGetCheckedValue = By.xpath("//p[@class='radiobutton']");
            public static By buttonGetValues = By.xpath("//button[@onclick='getValues();']");
            public static By paragraphGetGroupValues = By.xpath("//p[@class='groupradiobutton']");

            public static By setRadioButtonOptradio(Constant.BasicRadioButton value) {
                return By.xpath("//input[@value='%s' and @name='optradio']".formatted(value.value));
            }

            public static By setRadoButtonGender(String value) {
                return  By.xpath("//input[@value='%s' and @name='gender']".formatted(value));
            }

            public static By setRadioButtonAgeGroup(String value) {
                return  By.xpath("//input[@value='%s' and @name='ageGroup']".formatted(value));
            }
        }
    }

    public static class DemoQa{
        public static class TextBox{

            public static By paragraphConsent = By.xpath("//p[text()='Consent']");
        }
    }
}
