package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculatingStatistic {

    List<String> users = new ArrayList<>();
    int posts;
    int comments;
    double postAverage;
    double commentAverage;
    double averagePostsAndComments;
    Statistics statistics;

    public CalculatingStatistic() {

    }

    public void calculateAdvStatistics(Statistics statistics) {

        users = statistics.usersNames();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        if (users.size() > 0) {
            postAverage = (posts / users.size());
        } else {
            postAverage = 0;
        }

        if (users.size() > 0) {
            commentAverage = (comments / users.size());
        } else {
            commentAverage = 0;
        }

        if (posts > 0) {
            averagePostsAndComments = (posts / comments);
            System.out.println(averagePostsAndComments);
        } else {
            averagePostsAndComments = 0;

        }

    }

    public String showStatistics() {
        System.out.println("** ALL STATISTICS ** ");
        System.out.println("Users: " + users + " " +
                "Posts: " + posts + " " +
                "Comments: " + comments + " " +
                "Post Average: " + postAverage + " " +
                "Comments Average: " + commentAverage + " " +
                "Average Posts And Comments: " + averagePostsAndComments);

        return " ";
    }

    public List<String> getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostAverage() {
        return postAverage;
    }

    public double getCommentAverage() {
        return commentAverage;
    }

    public double getAveragePostsAndComments() {
        return averagePostsAndComments;
    }

    public Statistics getStatistics() {
        return statistics;
    }
}
