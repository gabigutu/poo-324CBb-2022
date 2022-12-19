public class NoSQL implements IDatabase {


    @Override
    public void connect(String username, String password) {
        System.out.println("NoSQL Connected with " + username + " and " + password);
    }

    @Override
    public void disconnect() {
        System.out.println("NoSQL Disconnected");
    }

    @Override
    public void something() {
        // nothing
    }
}
