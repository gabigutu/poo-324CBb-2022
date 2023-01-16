package factory;

public class Main {

    public static void main(String[] args) {
        Ferma ferma = Ferma.getInstance();
        Animal pisica = ferma.createAnimal("pisica");
        Animal porc = ferma.createAnimal("porc");
        Animal unicorn = ferma.createAnimal("unknown");
        if (pisica != null) {
            pisica.breathe();
        }
        if (porc != null) {
            porc.breathe();
        }
        if (unicorn != null) {
            unicorn.breathe();
        }
        System.out.println(ferma);

        Pig porc2 = new Pig();

    }
}
