package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistsGroupUsername(){
        //given
        //when
        Set<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        Set<String> expectedList = new HashSet<>();
        expectedList.add("Gale Boetticher");
        expectedList.add("Walter White");
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersOlderThanAge45(){
        //given
        final int LIMIT_AGE = 45;
        //when
        Set<User> result = UsersManager.filterUsersOlderThanGivenAge(LIMIT_AGE);
        //then
        Set<User> expectedList = new HashSet<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsernamesByNumberOfPostsBetweenMinAndMax(){
        //given
        final int MIN_NUMBER_OF_POSTS = 10;
        final int MAX_NUBMER_OF_POSTS = 200;
        //when
        Set<String> result = UsersManager.filterUsersWithNumberOfPostsBetweenMinAndMax(MIN_NUMBER_OF_POSTS, MAX_NUBMER_OF_POSTS);
        //then
        Set<String> expectedList = new HashSet<>();
        expectedList.add("Tuco Salamanca");
        assertEquals(expectedList, result);
    }
}