package com.codilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> finalList = new ArrayList<Integer>();
        for(Integer numb : numbers) {
            if (numb % 2 != 0) {
                finalList.add(numb);
            }
        }
        return finalList;
    }
}
