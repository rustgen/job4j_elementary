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
        int left1 = 21;
        int left2 = 21;
        int right1 = 3;
        int right2 = 3;
        int result = Max.max(Max.max(left1, left2), Max.max(right1, right2));
        int expected = 21;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To7To9To4Then9() {
        int left1 = 1;
        int left2 = 7;
        int right1 = 9;
        int right2 = 4;
        int result = Max.max(Max.max(left1, left2), Max.max(right1, right2));
        int expected = 9;
        Assert.assertEquals(expected, result);
    }
}