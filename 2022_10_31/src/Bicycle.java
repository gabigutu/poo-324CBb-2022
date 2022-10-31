public class Bicycle extends Vehicle {

    private boolean frontBrake;
    private boolean rearBrake;

    public Bicycle() {
        this(true, true);
    }

    public Bicycle(boolean frontBrake, boolean rearBrake) {
        super(2, "Bicycle");
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "frontBrake=" + frontBrake +
                ", rearBrake=" + rearBrake +
                ", noOfWheels=" + noOfWheels +
                '}';
    }

    public void pushBrake(short type) {
        switch (type) {
            case 1:
                System.out.println("Pushing front brake");
                break;
            case 2:
                System.out.println("Pushing back brake");
                break;
            default:
                System.out.println("I have only two types of brakes");
        }
    }

    public void pushBrake() {
        System.out.println("Trying to push brake, but I don't know which one");
    }

    public void pushBrake(int noOfPushes) {
        System.out.println("Trying to push brake for " + noOfPushes + " times");
    }
}
