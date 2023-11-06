package com.codilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("John Smith");
        theList.add("Judie Foster");
        theList.add("Rocky Balboa");
        theList.add("Tomasz Karolak");
        theList.add("Michał Brycławski");
        theList.add("Wojciech Domaradzki");
        theList.add("Kobe Bryant");
        theList.add("Andrzej Wajda");
        theList.add("Iga Swiatek");
        theList.add("Obiwan Kenobi");

        return new ArrayList<>(theList);
    }
}
