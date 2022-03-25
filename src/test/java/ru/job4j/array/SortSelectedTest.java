package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf7elements() {
        int[] data = new int[] {31, 42, 144, 23, 52, 56, 50};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {23, 31, 42, 50, 52, 56, 144};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {22, 5, 53};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 22, 53};
        Assert.assertArrayEquals(expected, result);
    }
}
