package com.kodilla.stream.test;// Pakiet: com.kodilla.stream.test

import com.kodilla.stream.User;
import com.kodilla.stream.test.UsersManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> expectedUsernames = Arrays.asList("John", "Alice", "Carol", "Dave");
        List<Object> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        Assert.assertEquals(expectedUsernames, chemistUsernames);
    }

    @Test
    public void testFilterUsersOlderThan() {
        List<User> expectedUsers = Arrays.asList(
                new User("Alice", 30, 5, "Chemists"),
                new User("Bob", 40, 15, "Engineers"),
                new User("Carol", 50, 20, "Chemists"),
                new User("Dave", 35, 8, "Chemists")
        );
        List<User> usersOlderThan30 = UsersManager.filterUsersOlderThan(30);
        Assert.assertEquals(expectedUsers, usersOlderThan30);
    }
}