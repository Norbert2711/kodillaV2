package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksTestSuite {

    @Test
    public void taskStrategyPatternTest(){

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.choseTask(TaskFactory.SHOPPINGtask);
        Task paintingTak = factory.choseTask(TaskFactory.PAINTINGtask);

        //Then
        System.out.println(shoppingTask.getTaskName());
        System.out.println(paintingTak.getTaskName());
        Assert.assertEquals("paintingTask", paintingTak.getTaskName());
        Assert.assertFalse(paintingTak.isTaskExecuted());
        Assert.assertEquals("shoppingTask", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());

    }

}
