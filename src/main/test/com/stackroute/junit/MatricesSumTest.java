package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.MatricesSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatricesSumTest {
    MatricesSum object;

    @Before
    public void setUp() throws Exception {
        object = new MatricesSum();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void check() {
        int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
        int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = object.checkSum(3, 2, a1, a2);

        assertArrayEquals(expected, actual);

    }
}