package com.kodilla.patterns.factory.tasks;


public class PaintingTask implements Task {

    public String taskName;
    public String color;
    public String whatToPaint;
    public boolean idDone;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean idDone) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.idDone = idDone;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public void executeTask() {
        idDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
