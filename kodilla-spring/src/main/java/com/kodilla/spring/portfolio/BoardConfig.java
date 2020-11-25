package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("to Do List")
    TaskList toDoList;

    @Autowired
    @Qualifier("in Progress List")
    TaskList inProgressList;

    @Autowired
    @Qualifier("done List")
    TaskList doneList;

    @Bean
    Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "to Do List")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "in Progress List")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done List")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Override
    public String toString() {
        return "BoardConfig{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
