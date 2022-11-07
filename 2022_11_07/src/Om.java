public class Om extends Fiinta implements SleepingCreature, EatingCreature {

//    String name = "Vasile";

    public Om() {
        this.name = "Vasile";
    }

    @Override
    boolean traieste() {
        return false;
    }

    @Override
    void aMurit() {
        System.out.println("Om a murit");
    }


    @Override
    public void seCulca() {
        System.out.println("Omul " + this.name + " se culca");
    }

    @Override
    public void seTrezeste() {
        System.out.println("Omul " + this.name + " se trezeste");
    }

    @Override
    public void mananca() {
        System.out.println("Omul " + this.name + " mananca");
    }
}
