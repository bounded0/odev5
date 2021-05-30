package bussiness.concretes;

import DataAccess.abstracts.UserDao;
import Entity.concretes.User;
import bussiness.abstracts.UserService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao userDao;
    @Override
    public void register(User user) {
        if(user.getPassword() <= 6|| user.getName().length() <= 2 || user.getLastName().length() <= 2){
            System.out.println("Error");
        }
        else{
            final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@(.+)$";
            Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(user.getEmail());
            if(!matcher.matches()){
                System.out.println(user.getEmail() + "Email cannot been stored in db");

            }
            for(User users: userDao.getAll()){
                if(users.getEmail().matches(user.getEmail())){
                    System.out.println("This email has been used");
                }
                else {
                    System.out.println("Successful");

                }
                }
            }
        }

    @Override
    public void login(User user) {
        for(User users: userDao.getAll()){
            if(users.getName().matches(user.getName())|| users.getPassword() == user.getPassword()){
                System.out.println("Logged !");
            }
            else if(!user.getName().matches(user.getName())|| user.getPassword() != user.getPassword()){
                System.out.println("Wrong");
            }
        }
    }

    @Override
    public void confirm(User user) {

    }

    // ******************************************************************************************************


}
