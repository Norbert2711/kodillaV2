package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1, "Adam", 'M', 1999, 12, 13, 5));
        forumUserList.add(new ForumUser(2, "Tomasz", 'M', 1987, 9, 24, 15));
        forumUserList.add(new ForumUser(3, "Anna", 'F', 2002, 3, 9, 4));
        forumUserList.add(new ForumUser(4, "Teresa", 'F', 2001, 1, 12, 9));
        forumUserList.add(new ForumUser(5, "Grzegorz", 'M', 1990, 4, 19, 4));
        forumUserList.add(new ForumUser(6, "Tobiasz", 'M', 1989, 8, 23, 0));
        forumUserList.add(new ForumUser(7, "Marzena", 'F', 2000, 10, 10, 12));
        forumUserList.add(new ForumUser(8, "Tomasz", 'M', 1988, 9, 24, 15));
        forumUserList.add(new ForumUser(9, "Anita", 'F', 2006, 3, 9, 4));
        forumUserList.add(new ForumUser(10, "Tatiana", 'F', 2002, 1, 12, 9));
        forumUserList.add(new ForumUser(11, "Sebastian", 'M', 1990, 4, 19, 4));
        forumUserList.add(new ForumUser(12, "Antoni", 'M', 1989, 8, 23, 0));
        forumUserList.add(new ForumUser(13, "Katarzyna", 'F', 1999, 8, 11, 12));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }

    @Override
    public String toString() {
        return "Forum{" +
                "forumUserList=" + forumUserList +
                '}';
    }
}
