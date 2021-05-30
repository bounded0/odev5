package bussiness.abstracts;

import Entity.concretes.User;

public interface UserService {
    void register(User user);
    void login(User user);
    void confirm(User user);


}
