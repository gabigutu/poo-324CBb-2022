package db;

public interface DatabaseConnector {

    void connect();
    void disconnect();

    boolean insert(Object something);

}
