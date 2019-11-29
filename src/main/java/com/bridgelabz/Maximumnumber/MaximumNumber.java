package com.bridgelabz.Maximumnumber;

import javax.print.DocFlavor;
import java.util.Arrays;

public class MaximumNumber<E extends Comparable> {

    public E testMaximum(E... items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    E temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        printMaximum(items[items.length - 1]);
        return items[items.length - 1];
    }
    public void printMaximum(E maximumNumber) {
        System.out.println("maximum number is " + maximumNumber);
    }
}
