package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
    UserServiceImpl userService = new UserServiceImpl();
    userService.createUsersTable();
    System.out.println("Количество пользователей: " + userService.getAllUsers().size());
    userService.saveUser("Name1", "LastName1", (byte) 15);
    userService.saveUser("Name2", "LastName2", (byte) 25);
    userService.saveUser("Name3", "LastName3", (byte) 31);
    userService.saveUser("Name4", "LastName4", (byte) 48);
    userService.removeUserById(1);
    System.out.println("Количество пользователей: " + userService.getAllUsers().size());
    System.out.printf(userService.getAllUsers().toString());
    userService.cleanUsersTable();
    userService.dropUsersTable();
    }
}