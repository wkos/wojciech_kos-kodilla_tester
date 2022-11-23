package com.kodilla.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsersRepository {
    public static Set<User> getUserList(){
        Set<User> users = new HashSet<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
}
