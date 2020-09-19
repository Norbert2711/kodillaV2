package com.kodilla.testing.forum;


import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;


public class ForumTestSuite {

    @Test
    public void testUserName() {

        //Given
        SimpleUser simpleUser = new SimpleUser("Kodilla");

        //When
        String name = simpleUser.getUsername();

        //Then
        Assert.assertEquals(name, "Kodilla");
    }

}
