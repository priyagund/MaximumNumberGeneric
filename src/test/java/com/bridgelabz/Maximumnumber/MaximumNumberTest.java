package com.bridgelabz.Maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    @Test
    public void giveNumber_isMaximum_shouldReturnMaxNumber()
    {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result = (Integer) maximumNumber.checkNumber(20, 30, 40);
        Assert.assertEquals(Integer.valueOf(40), result);

    }

    @Test
    public void givenFloatNumber_isMaximum_shouldReturnmaxNumber()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        Float result= (Float) maximumNumber.checkNumber(20.0f,30.2f,40.3f);
        Assert.assertEquals(Float.valueOf(40.3f),result);
    }

    @Test
    public void givenString_isMaximum_shouldReturnMaximum()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        String result= (String) maximumNumber.checkNumber("abc","pqr","xyz");
        Assert.assertEquals(String.valueOf("xyz"),result);
    }
}
