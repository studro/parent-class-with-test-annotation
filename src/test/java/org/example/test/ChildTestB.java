package org.example.test;

import static java.util.Arrays.asList;

import java.util.List;

public class ChildTestB extends ParentTest
{
    @Override
    protected List<Integer> getValues()
    {
        return asList( -5, 3, -8 );
    }
}
