package db;

public class NoSQLDatabase implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("NoSQL connected");
    }

    @Override
    public void disconnect() {
        System.out.println("NoSQL disconnected");
    }

    @Override
    public boolean insert(Object something) {
        System.out.println("NoSQL inserted row");
        return false;
    }
}
