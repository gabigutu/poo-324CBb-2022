public class MySQL implements IDatabase {

    @Override
    public void connect(String username, String password) {
        System.out.println("MySQL Connected with " + username + " and " + password);
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL Disonnected");
    }

    @Override
    public void something() {
        this.setMySQLSomething();
    }

    private void setMySQLSomething() {

    }
}
