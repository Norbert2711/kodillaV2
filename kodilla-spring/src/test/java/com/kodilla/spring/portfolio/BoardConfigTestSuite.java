package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardConfigTestSuite {

    @Test
    public void addTasks() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String takToDo = "Task to Do";
        board.getToDoList().addTask(takToDo);
        String progress = "Task In Progress";
        board.getInProgressList().addTask(progress);
        String done = "Done Task";
        board.getDoneList().addTask(done);
        System.out.println(board.getDoneList().getTasks().get(0));

        //Then
        Assert.assertEquals("Task to Do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task In Progress", board.inProgressList.getTasks().get(0));
        Assert.assertEquals("Done Task", board.doneList.getTasks().get(0));

    }

}
