package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(2, 2, 2);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 2.0;
        double bc = 4.0;
        double ac = 12.0;
        boolean result = Triangle.exist(2, 4, 12);
        Assert.assertFalse(result);
    }
}