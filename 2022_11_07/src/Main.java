import db.DatabaseConnector;
import db.MySQLDatabase;
import db.NoSQLDatabase;

public class Main {

    public static void main(String[] args) {
        Om om = new Om();
        om.saNascut(); // fiinta
        om.traieste(); // om
        om.seCulca();
        om.seTrezeste();
        om.aMurit(); // om

        Fiinta om2 = new Om();
        System.out.println("Om2 se numeste " +om2.name);
        if (om2 instanceof Om) {
            ((Om)om2).aMurit();
        }

        Fiinta animal = new Animal();
        animal.aMurit();

        DatabaseConnector databaseConnector = new NoSQLDatabase();
        databaseConnector.connect();

        Fiinta pisica1 = new Animal("Mitzy", 6);
        Fiinta pisica2 = new Animal("Mitzy", 6);
        System.out.println(((Animal)pisica1).compareTo(pisica2));

        try {
            Fiinta pisica3 = ((Animal) pisica1).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
