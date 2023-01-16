package factory;

public class Ferma {

    static Ferma instance;
    static Animal[] animals;
    static int index = 0;

    static Ferma getInstance() {
        if (instance == null) {
            instance = new Ferma();
        }
        return instance;
    }

    private Ferma() {
        animals = new Animal[100];
    }

    Animal createAnimal(String type) {
        Animal animal = null;
        switch (type) {
            case "porc":
                animal = new Pig();
                animals[index++] = animal;
                break;
            case "pisica":
                animal = new Cat();
                animals[index++] = animal;
                break;
        }
        return animal;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ferma: ");
        for (int i = 0; i < index; i++) {
            stringBuilder.append(animals[i] + ", ");
        }
        return stringBuilder.toString().trim(); // TODO: remove comma
    }
}
