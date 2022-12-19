public interface IDatabase {

    void connect(String username, String password);
    void disconnect();
    void something();

}
