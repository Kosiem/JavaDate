
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyDateTest {

    @Test
    public void testCreateMyDate(){

        int day = 28;
        int month = 3;
        int year = 2023;

        MyDate date = new MyDate(day,month,year);
        Assert.assertNotNull(date);

        Assert.assertEquals(28,date.getDay());
        Assert.assertEquals(3,date.getMonth());
        Assert.assertEquals(2023,date.getYear());



    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadMonthDayYearMyDate(){
        int day = 32;
        int month = 0;
        int year = 2054;

        Class<IllegalArgumentException> expected = IllegalArgumentException.class;

        MyDate date = new MyDate(day,month,year);
        Assert.assertNotNull(date);

    }

    @Test
    public void testMyDateDisplay(){
        int day = 1;
        int month = 4;
        int year = 2023;
        String expected = "01/04/2023";

        ByteArrayOutputStream display = new ByteArrayOutputStream();  // przechwytywanie wyjścia
        System.setOut(new PrintStream(display)); // przekierowanie strumienia wyjścia dna system.out

        MyDate date = new MyDate(day,month,year);
        date.displayDate();

        String displayOut = display.toString();
        Assert.assertEquals(expected,displayOut);

    }


}
