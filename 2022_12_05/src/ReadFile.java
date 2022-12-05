import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            File file = new File("test.in");
            Scanner scanner = new Scanner(file);
            throw new IOException("Ceva null");
        } catch (FileNotFoundException exception) {
            System.out.println("Nu exista fisierul!");
        } catch (IOException exception) {
            System.out.println("Exceptie de IO!");
        } finally {

        }
//        catch (NullPointerException exception) {
//            System.out.println("Null pointer pe undeva!");
//        }

    }
}
