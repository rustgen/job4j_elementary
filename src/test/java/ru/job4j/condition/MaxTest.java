package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax2To11Then11() {
        int left = 2;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax222To11Then222() {
        int left = 222;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 222;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2To3Then3() {
        int left = 2;
        int middle = 2;
        int right = 3;
        int result = Max.max(left, Max.max(middle, right));
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax21To2To3Then21() {
        int left = 21;
        int middle = 2;
        int right = 3;
        int result = Max.max(left, Max.max(middle, right));
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax21To21To3To3Then21() {
        int one = 21;
        int two = 21;
        int three = 3;
        int four = 3;
        int result = Max.max(Max.max(one, two), Max.max(three, four));
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To7To9To4Then9() {
        int one = 1;
        int two = 7;
        int three = 9;
        int four = 4;
        int result = Max.max(Max.max(one, two), Max.max(three, four));
        int expected = 9;
        Assert.assertEquals(expected, result);
    }
}