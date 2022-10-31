public class Vehicle extends Object {

    protected int noOfWheels;
    private String name;

    public Vehicle() {
        this(0, "Unknown");
        System.out.println("Vehicle constructor called");
    }

    public Vehicle(int noOfWheels, String name) {
        System.out.println("Vehicle constructor with parameters called");
        this.noOfWheels = noOfWheels;
        this.name = name;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfWheels=" + noOfWheels +
                ", name='" + name + '\'' +
                '}';
    }

}
