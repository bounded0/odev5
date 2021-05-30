package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entity.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users = new ArrayList<>();
    @Override
    public void register(User user) {
        System.out.println(user.getName() + "Successfully created account.");
        users.add(user);

    }

    @Override
    public void login(User user) {
        System.out.println(user.getName() + "Successfully logged");


    }

    @Override
    public void confirm(User user) {
        System.out.println(user.getEmail() + "Email has been confirmed :=)" );
        user.setVerify(true);
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
