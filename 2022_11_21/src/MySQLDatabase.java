public class MySQLDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("MySQL Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL Disconnected");
    }
}
