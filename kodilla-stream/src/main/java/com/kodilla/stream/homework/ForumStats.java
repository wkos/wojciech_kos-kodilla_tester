package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.Set;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(getAverageFromAgeLessThan40(UsersRepository.getUserList()));
        System.out.println(getAverageFromAgeGraterOrEquals40(UsersRepository.getUserList()));
    }
    public static double getAverageFromAgeLessThan40(Set<User> userList){
        double avg = userList
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(-1.0);
        return avg;
    }

    public static double getAverageFromAgeGraterOrEquals40(Set<User> userList){
        double avg = userList
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(-1.0);
        return avg;
    }
}
