package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ForumStatisticsTests {

    public List<String> userGenerator(int usersNumber) {
        ArrayList<String> usersGenerated = new ArrayList<>();
        for (int i = 0; i < usersNumber; i++) {
            usersGenerated.add("userName");
        }
        return usersGenerated;
    }

    public int postsGenerator(int postNumber) {
        for (int n = 0; n < postNumber; n++) {
            postNumber = +n;
        }
        return postNumber;
    }

    @Test
    public void forumTestWhenPostsAreZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistic.getPosts(), 0);

    }

    @Test
    public void forumTestWhenCommentsAreZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistic.getPosts(), 0);
    }

    @Test
    public void forumTestWhenUsersAreZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(0));

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistic.getUsers().size());

    }

    @Test
    public void forumTestWhenUsersAre100() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.usersNames()).thenReturn(userGenerator(100));

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculatingStatistic.getUsers().size());

    }

    @Test
    public void forumTestWhenPostsAre100() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userGenerator(10));

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculatingStatistic.getPosts(), 0.1);

    }

    @Test
    public void testWhenPostsAreLessThanComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(60);
        when(statisticsMock.usersNames()).thenReturn(userGenerator(10));

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculatingStatistic.getAveragePostsAndComments(), 1);

    }

    @Test
    public void showAllStats(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic();
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(60);
        when(statisticsMock.usersNames()).thenReturn(userGenerator(10));

        //When
        calculatingStatistic.calculateAdvStatistics(statisticsMock);

        String stats = calculatingStatistic.showStatistics();

        System.out.println(stats);
    }

}
