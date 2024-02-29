package lt.vcs.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testIncrement_whenProvidingNumber0_Th_expectingResult1() {
        //test pavadinimai turi pasakyti: kas daroma, kokie duomenys paduodami, ko tikimes
        //1. setUP / duomenu paruosimas
        int inputNumber = 0;
        int expectedResult = 0;
        int actualResult;

        //2. execution / atliekame testavimo veiksmus
        inputNumber++;
        actualResult = inputNumber;

        //3. assertsion / rezultatu sutikrinimas
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumWhenProvidingNumbers5and3Expecting8() {
        int input01 = 5;
        int input02 = 3;
        int expectedResult = 8;
        int actualResult;

        actualResult = input01 + input02;

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testContainsText_ProvidingLoremIpsumText_ExpectingTrue() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String expectedResult = "dolore magna dasfa";
        String actualResult;

        actualResult = input;

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void test() {
        String expectedResult = null;
        String actualResult = null;

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testSleepFor2sec() {
        long startTime = 0;
        long endTime = 0;
        int inputMillis = 2000;
        int expectedResult = 2;
        int actualResult = 0;

        startTime = System.currentTimeMillis();

        try {
            Thread.sleep(inputMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        endTime = System.currentTimeMillis();
        System.out.println("Start: %s, end: %s, difference; %s".formatted(startTime, endTime, (endTime - startTime)));

        actualResult = (int) ((endTime - startTime) / 1000);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
