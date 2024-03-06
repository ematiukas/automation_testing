package lt.evaldas.pom.tests.demoqa;

import lt.evaldas.pom.pages.demoqa.TextBoxPage;
import lt.evaldas.pom.pages.seleniumesasy.BasicFirstFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest {

        @BeforeMethod
        public void setUp() {
            TextBoxPage.open("https://demoqa.com/text-box");
        }

    @Test
    public void openBasicFirstFormPageFor3sec() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        TextBoxPage.close();
    }
}
