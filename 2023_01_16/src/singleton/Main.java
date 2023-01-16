package singleton;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstance("vasile", "parola!");
        Database database1 = Database.getInstance("gigel", "parola?");
        System.out.println(database);
        System.out.println(database1);

    }
}
