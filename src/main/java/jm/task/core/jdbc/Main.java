package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vasya", "Ivanov", (byte) 22);
        userService.saveUser("Rob", "Stark", (byte) 33);
        userService.saveUser("Tom", "Yam", (byte) 44);
        userService.saveUser("Annie", "Hall", (byte) 55);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}