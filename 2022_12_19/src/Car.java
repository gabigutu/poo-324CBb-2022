import java.util.List;

public class Car<T> implements Comparable<Car> {

    private int km;
    private T engine;

    public Car(int km) {
        this.km = km;
    }

    @Override
    public int compareTo(Car o) {
        return o.km - this.km;
    }

    public void setEngine(T engine) {
        this.engine = engine;
    }

    public T getEngine() {
        return this.engine;
    }

    public <X>void displayDrivers(X[] drivers, int noDrivers) {
        for (int i = 0; i < noDrivers; i++) {
            System.out.print("Driver " + i + ": " + drivers[i] + ", ");
        }
        System.out.println();
    }

    public <X> T something(X driver) {
        return engine;
    }

    public <Z extends Person> T somethingElse(Z driver, T engine) {
        return engine;
    }

    public <S> T somethingElse(List<? super S> driver, T engine) {
        return engine;
    }

    public void anotherMethod(List<? extends Person> drivers) {
    }

    public <L> void dadd(Car<? super L> car) {

    }
}
