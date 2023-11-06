package com.codilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Samali", 'M', LocalDate.of(1998, 5, 23), 7));
        usersList.add(new ForumUser(2, "Ania", 'F', LocalDate.of(1998, 8, 15), 2));
        usersList.add(new ForumUser(3, "BryckiRD", 'M', LocalDate.of(2005, 1, 30), 0));
        usersList.add(new ForumUser(4, "Curacao", 'M', LocalDate.of(1994, 10, 7), 12));
        usersList.add(new ForumUser(5, "Werka", 'F', LocalDate.of(1982, 3, 18), 8));
        usersList.add(new ForumUser(6, "Snajper", 'M', LocalDate.of(2000, 7, 12), 12));
        usersList.add(new ForumUser(7, "Exiu", 'M', LocalDate.of(2007, 2, 14), 0));
        usersList.add(new ForumUser(8, "Domczi", 'F', LocalDate.of(1991, 9, 20), 5));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
