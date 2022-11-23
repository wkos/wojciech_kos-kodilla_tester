package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUsername)
                .collect(Collectors.toList());
        return usernames;
    }

    private static void processUsersStream() {
        UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUsername) // .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
    }

    public static String getUsername(User user){
        return user.getUsername();
    }
}
