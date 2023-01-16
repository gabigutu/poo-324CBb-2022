package decorator;

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.breathe();
        FiintaCareDoarme sleepingHorse = new FiintaCareDoarme(horse);
        sleepingHorse.sleep();

        Trandafir trandafir = new Trandafir();
        trandafir.breathe();
        Planta fotosintezaTrandafir = new Planta(trandafir);
        fotosintezaTrandafir.fotosinteza();

    }

}
