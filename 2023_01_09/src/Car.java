public class Car implements Comparable<Car> {

    private String make;
    private String model;
    private int value;

    public Car(String make, String model, int value) {
        this.model = model;
        this.make = make;
        this.value = value;
    }

    @Override
    public int compareTo(Car o) {
        return o.value - this.value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", value=" + value +
                '}';
    }
}
