package com.kodilla.stream.test;// Pakiet: com.kodilla.stream

import com.kodilla.stream.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    private static List<User> users = Arrays.asList(
            new User("John", 25, 10, "Chemists"),
            new User("Alice", 30, 5, "Chemists"),
            new User("Bob", 40, 15, "Engineers"),
            new User("Carol", 50, 20, "Chemists"),
            new User("Dave", 35, 8, "Chemists")
    );

    public static List<Object> filterChemistGroupUsernames() {
        return users.stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersOlderThan(int age) {
        return users.stream()
              //  .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }
}




