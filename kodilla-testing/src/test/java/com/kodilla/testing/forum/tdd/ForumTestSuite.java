package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");

    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");

    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test number.# " + testCounter);

    }

    @Test
    public void addPost() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");

        //When
        forumUser.addPost("Hi all this is my first post here!", "Adam Malysz");

        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());

    }

    @Test
    public void addComment() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");

        //When
        forumUser.addComment(forumPost, "Welcone Adam, nice post! Have a nice day!",
                "Tomek Gozdzik");

        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());

    }


    @Test
    public void checkIfExistPost() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");

        //When
        forumUser.addPost(forumPost.getPostBody(), forumPost.getAuthor());
        ForumPost postNumber = forumUser.getPosts(0);

        //Then
        Assert.assertEquals(forumPost, postNumber);

    }

    @Test
    public void checkIfExistComment() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");
        ForumComment forumComment = new ForumComment(forumPost, "I hate comment posts",
                "Adam Malysz");

        //When
        forumUser.addComment(forumComment.getForumPost(), forumComment.getCommentBody(),
                forumComment.getAuthor());
        ForumComment commentNumber = forumUser.getComments(0);

        //Then
        Assert.assertEquals(forumComment, commentNumber);

    }

    @Test
    public void checkResultDeleteNotExistPost() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");

        //When
        boolean result = forumUser.removePost(forumPost);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void checkResultDeleteNotExistComment() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");
        ForumComment forumComment = new ForumComment(forumPost, "I hate comment posts",
                "Adam Malysz");

        //When
        boolean result = forumUser.removeComment(forumComment);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void checkIfChosenPostInClassWasDeleted() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");
        forumUser.addPost(forumPost.getPostBody(), forumPost.getAuthor());

        //When
        boolean result = forumUser.removePost(forumPost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());

    }

    @Test
    public void checkIfChosenCommentInClassWasDeleted() {

        //Given
        ForumUser forumUser = new ForumUser("Adam Malysz", "Malysz23");
        ForumPost forumPost = new ForumPost("Hi all this is my second post here!",
                "Adam Malysz");
        ForumComment forumComment = new ForumComment(forumPost, "I hate comment posts",
                "Adam Malysz");


        //When
        forumUser.addComment(forumComment.getForumPost(), forumComment.getCommentBody(),
                forumComment.getAuthor());
        boolean result = forumUser.removeComment(forumComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuantity());

    }

}