package decorator;

public class FiintaCareDoarme extends Fiinta { // Animal is a FiintaDecorator

    Fiinta fiinta;

    public FiintaCareDoarme(Fiinta fiinta) {
        this.fiinta = fiinta;
    }

    public void sleep() {
        System.out.println(fiinta + " sleeps");
    }


    @Override
    void breathe() {
        this.fiinta.breathe();
    }
}
