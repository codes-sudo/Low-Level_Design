package org.example.learning.Observable.Example2;

import java.util.List;

public class Group {
    private List<ISubscriber> users;

    public void subscribe(ISubscriber user) {
        users.add(user);
    }

    public void remove(ISubscriber user) {
        users.remove(user);
    }

    public void notify(String msg) {
        for (ISubscriber user: users) {
            user.notify(msg);
        }
    }
}
