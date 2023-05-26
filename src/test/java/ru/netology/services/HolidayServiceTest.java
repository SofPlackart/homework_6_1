package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void shouldCalcExact() {
        HolidayService service = new HolidayService();

        int expected = 2;
        int actual = service.calcHoliday(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact2() {
        HolidayService service = new HolidayService();

        int expected = 3;
        int actual = service.calcHoliday(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}
