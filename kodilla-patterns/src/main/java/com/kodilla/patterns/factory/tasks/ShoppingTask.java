package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    public String taskName;
    public String whatToBuy;
    double quantity;
    boolean isDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity,boolean isDone) {

        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isDone = isDone;
    }

    @Override
    public void executeTask() {
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

}
