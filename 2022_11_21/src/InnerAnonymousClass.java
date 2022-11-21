public class InnerAnonymousClass {

    public static void main(String[] args) {
        IDatabase mysqlDatabase = new MySQLDatabase();
        mysqlDatabase.connect();
        mysqlDatabase.disconnect();

        // class Anonymous implements IDatabase { }
        IDatabase noSqlDatabase = new IDatabase() {
            @Override
            public void connect() {
                this.test();
                System.out.println("NoSQL connected");
            }

            private void test() {
                System.out.println("Private method in anonymous class");
            }

            @Override
            public void disconnect() {
                System.out.println("NoSQL disconnected");
            }
        };
        noSqlDatabase.connect();
        noSqlDatabase.disconnect();

        // class Anonymous extends AbstractClass { }
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void something() {
                System.out.println("AbstractClass something called");
            }
        };

    }
}
