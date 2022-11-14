public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void goToSleep() {
        System.out.println("Person " + name + " goes to sleep");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    class Hand {

        String type;
        String name;

        public Hand(String type, String name) {
            this.type = type;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "type='" + type + '\'' +
                    ", name='" + this.name + '\'' +
                    '}' + " for person " + Person.this.name;
        }
    }

    public static void staticMethod() {
        System.out.println("This is a static method inside Person class");
    }

    static class Head {

        static int noHeads = 20;

        public Head() {
            System.out.println("New head created for " + name );
            Person.Head.noHeads++;
        }

        public void nonStatic() {
            System.out.println("Non static method in head class");
        }

        public static void showHead() {
            System.out.println("Person has a head");
        }

        public static void totalHeads() {
            System.out.println("No heads: " + noHeads);
        }


    }

}
