package com.bridgelabz.Maximumnumber;

import javax.print.DocFlavor;

public class MaximumNumber <E extends Comparable>
{

    E maximumNumber;
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumNumber( E firstValue, E secondValue, E thirdValue) {

        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E testMaximum() {
        E maximumNumber=this.maximumNumber;
        maximumNumber=this.firstValue;
        if (this.secondValue.compareTo(maximumNumber) > 0 ) {
             maximumNumber = secondValue;
        }
        if (this.thirdValue.compareTo(maximumNumber) > 0) {
             maximumNumber =thirdValue;
        }
        return maximumNumber;

    }


}
