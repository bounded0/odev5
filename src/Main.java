import DataAccess.abstracts.UserDao;
import DataAccess.concretes.HibernateUserDao;
import Entity.concretes.User;
import bussiness.abstracts.UserService;
import bussiness.concretes.UserManager;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao());
        User user = new User();
        user.setName("e");
        user.setLastName("a");
        user.setEmail("unalmnahmut84@gmail.com");
        user.setPassword(232332333);
        User user1 = new User();
        user1.setName("edsada");
        user1.setLastName("udsa");
        user1.setEmail("mnahmut8");
        user1.setPassword(1234567);

        userService.register(user1);
        userService.login(user1);
        userService.confirm(user1);
    }
}
