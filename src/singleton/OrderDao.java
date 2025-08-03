package singleton;

public class OrderDao {
    public void saveOrder() {
        String conn = ConnectionPool.getInstance().getConnection();
        System.out.println("OrderDao using connection: " + conn);
    }
}