package com.bridgelabz.Maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    @Test
    public void giveNumber_isMaximum_shouldReturnMaxNumber()
    {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result = (Integer) maximumNumber.testMaximum(10,50,70,30,20);
        Assert.assertEquals(Integer.valueOf(70), result);

    }

    @Test
    public void givenFloatNumber_isMaximum_shouldReturnmaxNumber()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        Float result= (Float) maximumNumber.testMaximum(20.0f,30.2f,40.3f,50.3f,60.8f);
        Assert.assertEquals(Float.valueOf(60.8f),result);
    }

    @Test
    public void givenString_isMaximum_shouldReturnMaximum()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        String result= (String) maximumNumber.testMaximum("abc","pqr","xyz","def","lmn");
        Assert.assertEquals(String.valueOf("xyz"),result);
    }
}
