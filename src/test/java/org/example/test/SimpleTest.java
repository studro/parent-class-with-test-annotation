package org.example.test;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;


public class SimpleTest
{
    @Test
    public void test()
    {
        final List<Integer> values = getValues();
        final int minuend = values.get( 0 );
        final int subtrahend = values.get( 1 );
        final int actualDifference = minuend - subtrahend;
        final int expectedDifference = values.get( 2 );
        assertEquals( actualDifference, expectedDifference );
    }

    protected List<Integer> getValues()
    {
        return asList( 98, 7, 91 );
    }
}
