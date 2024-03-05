package lt.evaldas.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestExercises {
//    4 yra lyginis skaičius
//    Dabar yra  daugiau nei 19 valandu


    @Test
    public void number4_arLyginis() {
        int input = 4;
        int expectedResult = 0;
        int actualResult;

        actualResult = input % 2;

        Assert.assertEquals(actualResult, expectedResult,
                "Skaicius %s nera lyginis.".formatted(input));
    }

    @Test
    public void Test_isCurrentHour_moreThan19() {

        int expectedTime = 19;
        int actualTime;

        actualTime = LocalDateTime.now().getHour();

        Assert.assertTrue(
                actualTime >= expectedTime,
                "\nExpected: %s\nActual: %s\n".formatted(expectedTime, actualTime)
        );
    }

    //    Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)

    @Test
    public void testZaliasJeigu_995_DalijasiIs_3_BeLiekanos() {
        int inputNumber = 995;
        int dalyba = 3;
        int expectedResult = 0;
        int actualResult;
        actualResult = inputNumber % dalyba;

        Assert.assertEquals(actualResult, expectedResult);
    }

    //    Testas “žalias” jeigu šiandien pirmadienis
//    @Test
//    public void testArSiandienTrecianis() {
//
//        DayOfWeek expectedResult = DayOfWeek.WEDNESDAY;
//        DayOfWeek actualResult = null;
//
//        actualResult = LocalDate.now().getDayOfWeek();
//
//        org.testng.assertEquals(
//                actualResult, expectedResult,
//                "\nExpected: %s, \nActual: %s\n".formatted(expectedResult, actualResult)
//        );
//    }

    @Test
    public void testArTreciadienisSiandien(){
        DayOfWeek expectedResult = DayOfWeek.WEDNESDAY;
        DayOfWeek actualResult = null;

        actualResult = LocalDate.now().getDayOfWeek();

        Assert.assertEquals(expectedResult, actualResult);
    }
//    Testas “žalias” po to, kai “palaukia” 5 sekundes

    @Test
    public void testasZaliasPoPenkiuSekundziu() {
        long startTime = 0;
        long endTime = 0;
        int inputMillis = 5000;
        int expectedResult = 5;
        int actualResult = 0;

        startTime = System.currentTimeMillis();

        try {
            Thread.sleep(inputMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        endTime = System.currentTimeMillis();
        System.out.println("\nStart: %s, \nend: %s, \ndifference; %s"
                .formatted(startTime, endTime, (endTime - startTime)));

        actualResult = (int) ((endTime - startTime) / 1000);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //    Bonus: Testas “žalias” jei nuo 1 iki 10 yra 4 lyginiai skaičiai
    @Test
    public void testArYra4LyginiaiTarp1Ir10(){
        int expectedEvenNumberCount = 4;
        int actualEvenNumberCount = 0;

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 0){
                actualEvenNumberCount++;
            }
        }
        Assert.assertEquals(actualEvenNumberCount, expectedEvenNumberCount);
    }
}
