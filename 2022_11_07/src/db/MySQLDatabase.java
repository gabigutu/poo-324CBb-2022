package db;

public class MySQLDatabase implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("MySQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected");
    }

    @Override
    public boolean insert(Object something) {
        System.out.println("MySQL inserted row");
        return false;
    }
}
