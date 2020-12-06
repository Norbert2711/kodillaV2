package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    public String taskName;
    public String where;
    public String using;
    public boolean isDone;

    public DrivingTask(String taskName, String where, String using, boolean isDone) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isDone = isDone;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        isDone = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
