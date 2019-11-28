package com.bridgelabz.Maximumnumber;

public class MaximumNumber
{

    public int checkNumber(Integer a,Integer b,Integer c) {
        Integer  maximumNumber = a;
        if (b.compareTo(maximumNumber) > 0 ) {
             maximumNumber = b;
        }
        if (c.compareTo(maximumNumber) > 0) {
             maximumNumber =c;
        }
        return maximumNumber;

    }

    public Float checkFloatNumber( Float a,Float b,Float c)
    {
        Float maxmumNumber=a;
        if (b.compareTo(maxmumNumber) > 0 ) {
            maxmumNumber = b;
        }
        if (c.compareTo(maxmumNumber) > 0) {
            maxmumNumber =c;
        }
        return maxmumNumber;

    }

}
