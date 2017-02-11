package org.example.test;

import static java.util.Arrays.asList;

import java.util.List;

public class ChildTestA extends ParentTest
{

    @Override
    protected List<Integer> getValues()
    {
        return asList( 3, 2, 1 );
    }

}
