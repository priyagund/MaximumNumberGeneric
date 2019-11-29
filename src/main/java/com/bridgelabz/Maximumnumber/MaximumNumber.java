package com.bridgelabz.Maximumnumber;

import javax.print.DocFlavor;
import java.util.Arrays;

public class MaximumNumber<E extends Comparable> {

    public E testMaximum(E... values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    E temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        printMaximum(values[values.length - 1]);
        return values[values.length - 1];
    }
    public void printMaximum(E maximumNumber) {
        System.out.println("maximum number is " + maximumNumber);
    }
}
