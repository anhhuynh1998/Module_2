package cleanCode.nextdaycalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testGetNextDay() {
        String expected = "2/3/2020";
        String actual = NextDayCalculator.getNextDay(1, 3, 2020);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayLeapYear() {
        String expected = "1/3/2024";
        String actual = NextDayCalculator.getNextDay(29, 2, 2024);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayEndOfYear() {
        String expected = "1/1/2021";
        String actual = NextDayCalculator.getNextDay(31, 12, 2020);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayInvalidDate() {
        String expected = "Invalid date";
        String actual = NextDayCalculator.getNextDay(32, 3, 2021);
        assertEquals(expected, actual);
    }
}
