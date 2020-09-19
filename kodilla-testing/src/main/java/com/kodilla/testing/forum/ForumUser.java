package com.kodilla.testing.forum;

import com.sun.org.apache.bcel.internal.generic.FCMPG;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();


    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String postBody, String author) {
        ForumPost forumPost = new ForumPost(postBody, author);
        posts.add(forumPost);

    }

    public void addComment(ForumPost forumPost, String commentBody, String author) {
        ForumComment forumComment = new ForumComment(forumPost, commentBody, author);
        comments.add(forumComment);

    }

    public int getPostQuantity() {
        return posts.size();

    }

    public int getCommentQuantity() {
        return comments.size();

    }

    public ForumPost getPosts(int postNumber) {

        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }

        return thePost;

    }


    public ForumComment getComments(int commentNumber) {

        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }

        return theComment;

    }


    public boolean removePost(ForumPost forumPost) {

        boolean result = false;

        if (posts.contains(forumPost)) {
            posts.remove(forumPost);
            result = true;
        }

        return result;
    }


    public boolean removeComment(ForumComment forumComment) {

        boolean result = false;

        if (comments.contains(forumComment)) {
            comments.remove(forumComment);
            result = true;
        }

        return result;
    }


    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", posts=" + posts +
                ", comments=" + comments +
                '}';
    }
}
