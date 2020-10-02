package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
       // User user = new User("Rylo");
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessage(user, "Hello user! How are you today?");
        } catch (MessageNotSentException e) {
            System.out.println("User was null well message wasn't send");
        }
    }
}
