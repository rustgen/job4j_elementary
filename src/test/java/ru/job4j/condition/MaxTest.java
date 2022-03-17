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
}