package singleton;

public class UserDao {
    public void saveUser() {
        String conn = ConnectionPool.getInstance().getConnection();
        System.out.println("UserDao using connection: " + conn);
    }
}