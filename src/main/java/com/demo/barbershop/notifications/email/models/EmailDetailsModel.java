package com.demo.barbershop.notifications.email.models;


public class EmailDetailsModel {

    private String from;
    private String to;
    private String subject;
    private String text;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
