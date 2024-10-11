package org.example.learning.Observable.Example1;

public class MyTopicSubscriber implements Observer{
    private String message;
    private Subject topic;

    public MyTopicSubscriber(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null) {
            System.out.println("No update From Topic");
        } else {
            System.out.println("New Message From Topic: "+ message);
        }
    }

    @Override
    public void setSubject(Subject obj) {
        this.topic = obj;
    }
}
