package com.kodilla.posts;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ForumStatsTest {
    @Test
    public void testCalculateAveragePostsWithAgeGreaterOrEqual() {
        List<User> testUsers = Arrays.asList(
                new User("John", 25, 10, "Chemists"),
                new User("Alice", 40, 5, "Chemists"),
                new User("Bob", 40, 15, "Engineers"),
                new User("Carol", 50, 20, "Chemists"),
                new User("Dave", 35, 8, "Chemists")
        );

        double averagePosts = ForumStats.calculateAveragePostsWithAgeGreaterOrEqual(testUsers, 40);
        Assert.assertEquals(10.0, averagePosts, 0.01);
    }

    @Test
    public void testCalculateAveragePostsWithAgeLessThan() {
        List<User> testUsers = Arrays.asList(
                new User("John", 25, 10, "Chemists"),
                new User("Alice", 30, 5, "Chemists"),
                new User("Bob", 30, 15, "Engineers"),
                new User("Carol", 50, 20, "Chemists"),
                new User("Dave", 35, 8, "Chemists")
        );

        double averagePosts = ForumStats.calculateAveragePostsWithAgeLessThan(testUsers, 40);
        Assert.assertEquals(9.33, averagePosts, 0.01);
    }

    @Test
    public void testCalculateAveragePostsWithNoUsers() {
        List<User> testUsers = Arrays.asList();

        double averagePosts = ForumStats.calculateAveragePostsWithAgeGreaterOrEqual(testUsers, 40);
        Assert.assertEquals(0.0, averagePosts, 0.01);
    }
}
