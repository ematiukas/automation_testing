package lt.evaldas.pom.tests.demoqa;

import lt.evaldas.pom.pages.demoqa.ButtonPages;
import lt.evaldas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonTest extends TestBase {
    @BeforeClass
    @Override
    public void setUp(){
        ButtonPages.open("https://demoqa.com/buttons");
    }
    @Test
    public void test(){
        String expectedResult = "double click";
        String actualResult;

        ButtonPages.doubleClickOnButton();
        actualResult = ButtonPages.readDoubleClickMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }
}
