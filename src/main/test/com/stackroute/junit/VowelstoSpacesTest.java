package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.VowelstoSpaces;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelstoSpacesTest {
    VowelstoSpaces object;

    @Before

    public void setUp() throws Exception {
        object = new VowelstoSpaces();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void check() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = object.removeVowels(str);

        assertArrayEquals(expected, actual);


    }
}