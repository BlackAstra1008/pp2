package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserDao userdao = new UserDaoJDBCImpl();
    public UserDao getUserDaoJDBCImpl() {
        return userdao;
    }
    public void createUsersTable() {
        userdao.createUsersTable();
    }

    public void dropUsersTable() {
        userdao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userdao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userdao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userdao.getAllUsers();
    }

    public void cleanUsersTable() {
        userdao.cleanUsersTable();
    }
}
