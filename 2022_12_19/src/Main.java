import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        List myList = new ArrayList();
        Car car = new Car(10 * 1000);
        Student student = new Student();
        myList.add(car);
        myList.add(student);

        Person person = new Person();
        List<Person> secondList = new ArrayList<>();
        secondList.add(person);
        secondList.add(student);
//        secondList.add(car);

        Map<Object, Object> hm = new HashMap(); // loose coupling
        hm.put("vasilica", student);
        hm.put("dacia", car);

        IDatabase myDb = new NoSQL();
        myDb.something();
        myDb.connect("vasile", "parola");
        myDb.disconnect();


        Map<Student, Car> studentCarMap = new HashMap<>();
        studentCarMap.put(student, car);
//        studentCarMap.put(car, student);

        Engine myEngine = new Engine("gas", "VW");
        Car<Engine> newCar = new Car(90 * 1000);
        newCar.setEngine(myEngine);
        Engine carEngine = newCar.getEngine();
        Object[] drivers = new Object[2];
        drivers[0] = new Object();
        drivers[1] = new Object();
        newCar.displayDrivers(drivers, 2);

        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();
        newCar.<Student>displayDrivers(students, 2);

        Engine engine = newCar.<Student>something(student); // !!!

        Car<Student> anotherCar = new Car<>(100);
        Student anotherStudent = anotherCar.<Student>something(student);

//        Car<Student> anotherCar = new Car<>(100);
//        anotherCar.<Person>somethingElse(student, engine);
        anotherCar.<Person>somethingElse(student, student);
//        Car<Engine> newCar = new Car(90 * 1000);
        newCar.<Person>somethingElse(student, engine);
//        newCar.<Object>somethingElse(student, engine);

        Car<Person> latestCar = new Car<>(888);
        newCar.<Student>dadd(latestCar);
//        newCar.<Car>dadd(latestCar);

    }
}
