package org.example.test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

public abstract class ParentTest
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

    protected abstract List<Integer> getValues();
}
