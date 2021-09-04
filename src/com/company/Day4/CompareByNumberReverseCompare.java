package com.company.Day4;

import java.util.Comparator;

public class CompareByNumberReverseCompare implements Comparator<SortedObject> {
    @Override
    public int compare(SortedObject o1, SortedObject o2) {
        return Integer.compare(o2.getNumber(), o1.getNumber());
    }
}
