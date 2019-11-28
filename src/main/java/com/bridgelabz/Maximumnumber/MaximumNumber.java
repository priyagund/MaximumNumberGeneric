package com.bridgelabz.Maximumnumber;

import javax.print.DocFlavor;

public class MaximumNumber <E extends Comparable>
{

    E maximumNumber;
    public E checkNumber(E a,E b,E c) {
         maximumNumber=a;
        if (b.compareTo(maximumNumber) > 0 ) {
             maximumNumber = b;
        }
        if (c.compareTo(maximumNumber) > 0) {
             maximumNumber =c;
        }
        return maximumNumber;

    }


}
