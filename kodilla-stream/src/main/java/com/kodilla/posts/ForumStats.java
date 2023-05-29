package com.kodilla.posts;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;
public class ForumStats {
    public static double calculateAveragePostsWithAgeGreaterOrEqual(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() >= age)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static double calculateAveragePostsWithAgeLessThan(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() < age)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsers();
        double averagePostsOver40 = calculateAveragePostsWithAgeGreaterOrEqual(users, 40);
        double averagePostsUnder40 = calculateAveragePostsWithAgeLessThan(users, 40);

        System.out.println("Average posts for users aged 40 or older: " + averagePostsOver40);
        System.out.println("Average posts for users aged under 40: " + averagePostsUnder40);
    }
}
