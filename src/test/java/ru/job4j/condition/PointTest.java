package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenThis00That20ThenDistanceEqual20() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenThis01That21ThenDistanceEqual20() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 1);
        double expected = 2.0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenThis21That21ThenDistanceEqual0() {
        Point a = new Point(2, 1);
        Point b = new Point(2, 1);
        double expected = 0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenThis23That25ThenDistanceEqual20() {
        Point a = new Point(2, 3);
        Point b = new Point(2, 5);
        double expected = 2.0;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void whenThis234That258Then3DDistanceEqual0() {
        Point a = new Point(2, 3, 4);
        Point b = new Point(2, 5, 8);
        double expected = 4.47;
        double res = a.distance3d(b);
        assertEquals(expected, res, 0.01);
    }

    @Test
    public void whenThis234That258Then3DDistanceEqual412() {
        Point a = new Point(2, 3, 5);
        Point b = new Point(4, 5, 2);
        double expected = 4.12;
        double res = a.distance3d(b);
        assertEquals(expected, res, 0.01);
    }
}