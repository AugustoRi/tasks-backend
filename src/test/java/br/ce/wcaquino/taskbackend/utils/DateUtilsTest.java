package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void handleReturnFalseToPassedDates() {
        LocalDate date = LocalDate.of(2010, 1, 1);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void handleReturnTrueToActualDate() {
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void handleReturnTrueToFutureDates() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }
}
