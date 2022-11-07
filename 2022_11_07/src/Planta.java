public class Planta extends Fiinta implements BreathingCreature {
    @Override
    public void respira() {
        System.out.println("Planta respira");
    }

    @Override
    boolean traieste() {
        System.out.println("Planta traieste");
        return true;
    }

    @Override
    void aMurit() {
        System.out.println("Planta a murit");
    }
}
