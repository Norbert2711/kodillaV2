package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVNGtask = "DRIVING";
    public static final String PAINTINGtask = "PAINTING";
    public static final String SHOPPINGtask = "SHOPPING";

    public final Task choseTask(final String taskClass) {

        switch (taskClass) {
            case DRIVNGtask:
                return new DrivingTask("drivingTask", "To Gdansk", "Car", false);

            case PAINTINGtask:
                return new PaintingTask("paintingTask", "blue", "living room", true);
            case SHOPPINGtask:
                return new ShoppingTask("shoppingTask", "Meat", 3.0, false);

            default:
                return null;

        }

    }

}
