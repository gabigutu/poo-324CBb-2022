package decorator;

public class Planta extends Fiinta {

    private Fiinta fiinta;

    public Planta(Fiinta fiinta) {
        this.fiinta = fiinta;
    }

    public void fotosinteza() {
        System.out.println(fiinta + " face fontosinteza");
    }

    @Override
    void breathe() {
        this.fiinta.breathe();
    }
}
