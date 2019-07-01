package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ConsecutiveTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTestTest
{
    ConsecutiveTest object;
    @Before
    public void setUp() throws Exception {
        object=new ConsecutiveTest();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void checkNon() {
        boolean expected = false;

        boolean actual = object.checkForConsectiveNumbers("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = object.checkForConsectiveNumbers("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = object.checkForConsectiveNumbers("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }


}