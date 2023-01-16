package decorator;

public class Horse extends Fiinta {

    private String tip = "Cal";

    @Override
    public void breathe() {
        System.out.println(tip + " respira");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "tip='" + tip + '\'' +
                '}';
    }
}
