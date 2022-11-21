public class InnerClassInMethod {

    public String message = "Hello!";

    public static void main(String[] args) {
        class Greet {
            public Greet() {
                System.out.println("Greet constructor called");
            }

            public void sayMessage() {
//                System.out.println("Message: " + message);
            }
        }

        Greet greet = new Greet();
        greet.sayMessage();

        InnerClassInMethod innerClassInMethod = new InnerClassInMethod();
        innerClassInMethod.altceva();
    }

    public void altceva() {
        int no = 4;
        class Greet {
            public Greet() {
                System.out.println("Greet constructor called");
            }

            public void sayMessage() {
                System.out.println("Message: " + message + " and no: " + no);
            }
        }

        Greet greet = new Greet();
        greet.sayMessage();
    }


}
