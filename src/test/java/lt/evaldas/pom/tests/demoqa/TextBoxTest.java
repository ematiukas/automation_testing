package lt.evaldas.pom.tests.demoqa;

import lt.evaldas.pom.pages.demoqa.TextBoxPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase {
        @BeforeMethod
        @Override
        public void setUp() {
            TextBoxPage.open("https://demoqa.com/text-box");
            TextBoxPage.closeConsent();
        }

    @Test
    public void openBasicFirstFormPageFor3sec() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void testGiveFullNameYoda_whenTextBoxForm_thenReadsYoda() {
//
//        String inputFullName = "Vardas";
//        String expectedResult = "Vardas";
//        String actualResult = null;
//
//        TextBoxPage.enterFullName(inputFullName);
//        TextBoxPage.clickOnButtonSubmit();
//        actualResult = TextBoxPage.readMessageFullName();
//
//            Assert.assertTrue(
//                    actualResult.contains(expectedResult),
//                    "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
//            );
//        }

    }

