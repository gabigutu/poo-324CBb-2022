package singleton;

public class Database {

    String username;
    String password;
    static Database instance = null;

    private Database(String username, String password) {
        this.username = username;
        this.password = password;
    }

    static Database getInstance(String username, String password) {
        if (instance == null) {
            instance = new Database(username, password);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "singleton.Database{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
