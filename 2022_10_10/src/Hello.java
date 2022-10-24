public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        int x = 4;
        System.out.println("x = " + x);

        double y = 4.23;
        System.out.println("y = " + y);

        float z = 5.2f;

        final long t = 62173187137836867l;
//        t = 2;

        System.out.println(x++); // 4
        System.out.println(++x); // 6

        String myStr = "Hello, world!";
        System.out.println("The string says: " + myStr);
        System.out.println("String length = " + myStr.length());

        System.out.println(x % 3 == 0 ? "divizibil cu 3" : "nu e divizibil cu 3");

        String myFormat = "Numarul x este: %4d, iar z este: %5.3f";
        System.out.printf(myFormat, x, z);
    }


}
