package org.example.learning.Builder.Example1;

public class User {
    private final String userId;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double weight;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.weight = userBuilder.weight;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    static class UserBuilder {
        private final String userId;
        private final String firstName;
        private final String lastName;
        private int age;
        private double weight;

        public UserBuilder(String userId, String firstName, String lastName) {
            this.userId = userId;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        UserBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        User Build() {
            return new User(this);
        }
    }
}
