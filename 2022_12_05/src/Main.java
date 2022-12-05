import java.io.FileNotFoundException;

public class Main {

    static int impartireCuThrow(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Nu pot imparti la zero!", new IllegalArgumentException("Something that should be chained"));
        }
        return a/b;
    }

    static int impartireCuTry(int a, int b) {
        int c = -1;
        try {
            c = a/b;
            System.out.println("Mesaj dupa impartire (in try)");
            return c;
        } catch (ArithmeticException ex) {
            System.out.println("Am primit exceptia: " + ex.getMessage());
            System.exit(-1);
            return -1;
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println(impartireCuThrow(4, 0));
        } catch (Exception ex) {
            System.out.println("Am primit exceptie de la functia de impartire: " + ex.getMessage());
            ex.printStackTrace();
            System.out.println("Cause message: " + ex.getCause().getMessage());
        } finally {
            System.out.println("Mesaj din finally");
        }
        System.out.println("Mesaj dupa impartire");

    }

}
