package com.codilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final Integer id;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(final Integer id, final String username, final char sex, final LocalDate birthDate, final int postQuantity) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
