package org.example.learning.Builder.Example1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("1","abc","edf").Build();
        User user2 = new User.UserBuilder("2","efg","klm").age(18).Build();
    }
}
