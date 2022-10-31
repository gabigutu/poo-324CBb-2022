public class Main {

    public static void main(String[] args) {
	    Car car = new Car("Audi");
//        Car car = new Car();
        System.out.println("The car: " + car);
        System.out.println("Number of wheels: " + car.getNoOfWheels());
        System.out.println("The car: " + car.toString());

        Vehicle vehicle = new Vehicle(3, "BatMobil");

        Bicycle bicycle = new Bicycle(true, false);
        System.out.println("Number of wheels for bicycle: " + bicycle.getNoOfWheels());
        System.out.println("The bicycle: " + bicycle.toString());

        bicycle.pushBrake();
        bicycle.pushBrake(100);
        bicycle.pushBrake((short)3);

        Vehicle bicycle2 = new Bicycle();
//        bicycle2.pushBrake();
        if (bicycle2 instanceof Bicycle) {
            ((Bicycle)bicycle2).pushBrake();
        } else {
            System.err.println("Cannot push bicycle brake on bicycle2");
        }

        Vehicle car2 = new Car();
        if (car2 instanceof Bicycle) {
            ((Bicycle) car2).pushBrake();
        } else {
            System.err.println("Cannot push bicycle brake on car2");
        }

    }
}
