package com.codilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {

    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("John Tolkien", "Lord of the rings", 1995, "0001"));
        theBookList.add(new Book("Anna Holand", "Za duży na bajki", 1852, "0002"));
        theBookList.add(new Book("Robert Deniro", "Zabić drozda", 2003, "0003"));
        theBookList.add(new Book("Kornel Makuszyński", "Diabeł z 7 klasy", 1973, "0004"));
        theBookList.add(new Book("George Martin", "Gra o tron", 2013, "0005"));
        theBookList.add(new Book("Aleksander Fredro", "Zemsta", 1752, "0006"));
        theBookList.add(new Book("Chandler Bing", "Sarcasm", 1994, "0007"));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
