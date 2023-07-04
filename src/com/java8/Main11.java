package com.java8;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {
        List<User> users = List.of(
        		 new User(1, "Obaid", 31, true),
                 new User(2, "Aamir", 32, false),
                 new User(3, "Alam", 27, true),
                 new User(4, "Aamir", 40, false),
                 new User(5, "Asadullah", 24, true),
                 new User(6, "Nadaan_parindey", 50, false)
        );
        List<User> uniqueUsers = User.findUniqueByName(users);
        for (User user : uniqueUsers) {
            System.out.println(user.id+ " " + user.name + " " + user.age + " " + user.isActive);
        }
    }
}