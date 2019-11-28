package com.bridgelabz.Maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    @Test
    public void giveNumber_isMaximum_shouldReturnTrue()
    {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer result =  maximumNumber.checkNumber(20, 30, 40);
        Assert.assertEquals(Integer.valueOf(40), result);

    }





}
