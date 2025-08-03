package singleton;

import java.util.UUID;

public class ConnectionPool {
    private static volatile ConnectionPool instance;
    private final String id;

    private ConnectionPool() {
        this.id = "conn-" + UUID.randomUUID();
        System.out.println("Initialized new connection pool: " + id);
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    public String getConnection() {
        return id;
    }
}