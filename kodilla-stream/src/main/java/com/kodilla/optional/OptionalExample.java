package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("User1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);
        String username = optionalUser.orElse(new User("", 0, 0, "")).getUsername();
        System.out.println(username);

        User user1 = null;
        Optional<User> optionalUser1 = Optional.ofNullable(user1);
        String username1 = optionalUser1.orElse(new User("", 0, 0, "")).getUsername();
        System.out.println(username1);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
