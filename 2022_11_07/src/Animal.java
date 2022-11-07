public class Animal extends Fiinta implements SleepingCreature, EatingCreature, Comparable, Cloneable {

    int age;

    Animal() {
        this("UnknownCreature");
    }

    Animal(String name) {
        this(name, -1);
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    boolean traieste() {
        return false;
    }

    @Override
    void aMurit() {
        System.out.println("Animal a murit");
    }

    @Override
    public void mananca() {
        System.out.println("Animal " + this.name + " mananca ");
    }

    @Override
    public void seCulca() {
        System.out.println("Animal " + this.name + " se culca");
    }

    @Override
    public void seTrezeste() {
        System.out.println("Animal " + this.name + " se trezeste");
    }

    @Override
    public int compareTo(Object o) {
        if (this.name == ((Animal)o).name && this.age == ((Animal)o).age) return 0;
        if (this.name.compareTo(((Animal)o).name) < 0 && (this.age - ((Animal)o).age) < 0) {
            return -1;
        } else if (this.name.compareTo(((Animal)o).name) > 0 && (this.age - ((Animal)o).age) > 0) {
            return 1;
        }
        return 2; // ???
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        Animal animalNou = new Animal(this.name, this.age);
        return animalNou;
    }
}
