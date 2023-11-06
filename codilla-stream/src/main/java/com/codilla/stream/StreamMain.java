package com.codilla.stream;

import com.codilla.stream.book.Book;
import com.codilla.stream.book.BookDirectory;
import com.codilla.stream.forumuser.Forum;
import com.codilla.stream.immutable.ForumUser;
import com.codilla.stream.lambda.*;
import com.codilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> usersMap = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2004)
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                .collect(Collectors.toMap(forumUser -> forumUser.getId(), forumUser -> forumUser));
    }
}
