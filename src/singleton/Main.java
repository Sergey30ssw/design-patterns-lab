package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating Singleton pattern:");

        UserDao userDao = new UserDao();
        OrderDao orderDao = new OrderDao();

        userDao.saveUser();
        orderDao.saveOrder();

        ConnectionPool pool1 = ConnectionPool.getInstance();
        ConnectionPool pool2 = ConnectionPool.getInstance();

        System.out.println("\nSingleton verification:");
        System.out.println("Same instance: " + (pool1 == pool2));
        System.out.println("Pool1 hash: " + System.identityHashCode(pool1));
        System.out.println("Pool2 hash: " + System.identityHashCode(pool2));
        System.out.println("Both using connection: " + pool1.getConnection());
    }
}