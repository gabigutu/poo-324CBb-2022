public class Car extends Vehicle {

    String make;

    public Car() {
        super(4, "Masina");
        System.out.println("Car constructor called");
    }

    public Car(String make) {
        this.make = make;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", noOfWheels='" + noOfWheels + '\'' + // check this: works if default privilege
                '}';
    }
}
