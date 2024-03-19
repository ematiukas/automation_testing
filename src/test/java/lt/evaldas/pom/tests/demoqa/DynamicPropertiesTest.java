package lt.evaldas.pom.tests.demoqa;

import lt.evaldas.pom.pages.demoqa.DynamicPropertiesPage;
import lt.evaldas.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DynamicPropertiesPage.open("https://demoqa.com/dynamic-properties");
    }

    @Test
    public void testButtonVisibleAfter(){
       DynamicPropertiesPage.clickOnButtonVisibleAfter();
    }

    @Test
    public void testButtonVisibleAfterWithCustomiseWait(){
        DynamicPropertiesPage.clickOnButtonVisibleAfterWithCustomiseWait();
    }

    @Test
    public void testButtonEnableOfter(){
    //    DynamicPropertiesPage.checkButtonAttributes();
        DynamicPropertiesPage.clickOnButtonEnableAfter();
    }

    @Test
    public void testButtonColorChange(){
//            DynamicPropertiesPage.checkButtonAttributes();
        DynamicPropertiesPage.clickOnButtonColorChange();
    }
}
