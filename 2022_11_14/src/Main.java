public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Vasile");
        Person.Head headPerson1 = new Person.Head();
        headPerson1.nonStatic();
        System.out.println(person1);
        person1.goToSleep();
        Person.Hand leftHand = person1.new Hand("left", "Mana stanga");
        Person.Hand rightHand = person1.new Hand("right", "Mana dreapta");
        System.out.println(leftHand);
        System.out.println(rightHand);

        Person.staticMethod();
        Person.Head.showHead();
        Person.Head.totalHeads();
    }
}
