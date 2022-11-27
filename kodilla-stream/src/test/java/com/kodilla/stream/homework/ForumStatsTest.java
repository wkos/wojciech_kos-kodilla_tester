package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    Set<User> users = new HashSet<>();

    @Test
    public void testAverageNumberOfPostsForUsersWithAgeLessThan40(){
        //given
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 16, "Manager"));
        //when
        double result = ForumStats.getAverageFromAgeLessThan40(users);
        //then
        double expectedAverage = 31;
        assertEquals(expectedAverage, result);
    }

    @Test
    public void testAverageNumberOfPostsForUsersWithAgeLessThan40WithNoConditionMet(){
        //given
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 55, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 54, 16, "Manager"));
        //when
        double result = ForumStats.getAverageFromAgeLessThan40(users);
        //then
        double expectedAverage = -1.0;
        assertEquals(expectedAverage, result);
    }

    @Test
    public void testAverageNumberOfPostsForUsersWithAgeLessThan40WithOneUser40Age(){
        //given
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 55, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 16, "Manager"));
        //when
        double result = ForumStats.getAverageFromAgeLessThan40(users);
        //then
        double expectedAverage = -1.0;
        assertEquals(expectedAverage, result);
    }

    @Test
    public void testAverageNumberOfPostsForUsersWithAgeGraterOrEqual40WithNoConditionMet(){
        //given
        users.add(new User("Walter White", 20, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 16, "Manager"));
        //when
        double result = ForumStats.getAverageFromAgeGraterOrEquals40(users);
        //then
        double expectedAverage = -1.0;
        assertEquals(expectedAverage, result);
    }

    @Test
    public void testAverageNumberOfPostsForUsersWithAgeGraterOrEqual40WithOneBoundaryCondition(){
        //given
        users.add(new User("Walter White", 40, 7, "Chemists"));
        //when
        double result = ForumStats.getAverageFromAgeGraterOrEquals40(users);
        //then
        double expectedAverage = 7.0;
        assertEquals(expectedAverage, result);
    }
    @Test
    public void testAverageNumberOfPostsForUsersWithAgeGraterOrEqual40(){
        //given
        users.add(new User("Walter White", 20, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 46, 46, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 16, "Manager"));
        users.add(new User("Walter White", 77, 77, "Chemists"));
        users.add(new User("Jessie Pinkman", 45, 45, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 40, "Manager"));
        //when
        double result = ForumStats.getAverageFromAgeGraterOrEquals40(users);
        //then
        double expectedAverage = 52.0;
        assertEquals(expectedAverage, result);
    }

}