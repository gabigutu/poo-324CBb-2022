import java.io.*;

public class Main {

    public static void main(String[] args) {
	    String s = "Salut, Vasile!";
        System.out.println(s.toUpperCase());

        String s1 = "Buna";
        String s2 = new String("ziua"); // "ziua"
        String s3 = "Buna";
        System.out.println((s1==s2)); // false
        System.out.println((s1==s3)); // true

        String s4 = new String("Buna");
        System.out.println("s3==s4: " + (s3==s4)); // false
        System.out.println("s3.equals(s4): " + s3.equals(s4));
        System.out.println("s3.compareTo(s4): "  + (s3.compareTo(s4) == 0));

        System.out.println("ziua.*: " + s2.matches("ziua.*")); // true
        System.out.println("ziua.+: " + s2.matches("ziua.+")); // false
        System.out.println("ziu.+: " + s2.matches("ziu.+")); // true
        System.out.println("ziu[a-z]+: " + s2.matches("ziu[a-z]+")); // true
        System.out.println("ziu[b-z]+: " + s2.matches("ziu[b-z]+")); // false
        System.out.println("ziu[0-9]+: " + s2.matches("ziu[0-9]+")); // false
        System.out.println("zi[a-z]*: " + s2.matches("zi[a-z]*")); // true
        System.out.println("zi[b-z]*: " + s2.matches("zi[b-z]*")); // false
        System.out.println("s2 zi[b-z]+[b-z]*: " + s2.matches("zi[b-z]+[b-z]*a")); // true
        System.out.println("zicsa zi[b-z]+[b-z]*: " + "zicsa".matches("zi[b-z]+[b-z]*a")); // true
        System.out.println("zi[b-z]{1}[a-z]{1}: " + s2.matches("zi[b-z]{1}[a-z]{1}")); // true
        System.out.println("zi[a-z]{2}: " + s2.matches("zi[a-z]{2}")); // true
        System.out.println("^zi.*: " + "zidadaadadda".matches("^zi.*")); // true
        System.out.println("^zi.*: " + "dadaziadadda".matches("^zi.*")); // false
        System.out.println(".*zi.*: " + "dadaziadadda".matches(".*zi.*")); // true
        System.out.println("a$: " + "ziua".matches("a$")); // false
        System.out.println(".*a$: " + "ziua".matches(".*a$")); // true
        System.out.println(".a$: " + "za".matches(".a$")); // true

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        for(int i = 0; i< 10; i++) {
            sb.append("world ");
        }
        String sir = sb.toString();
        System.out.println(sir.trim());

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("test.dat");
            for (int i = 1; i <= 50; i++) {
                out.write(i);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Nu exista fisierul test.dat");
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException exception) {
                System.out.println("Could not close file that was not opened!");
            }
        }

        FileInputStream in = null;
        int x;
        try {
            in = new FileInputStream("test.dat");
            while ((x = in.read()) != -1) // -1 semnifică finalul de
                System.out.print(x + " ");
        } catch (FileNotFoundException exception) {
            System.out.println("Nu exista fisierul test.dat");
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException exception) {
                System.out.println("Could not close file that was not opened!");
            }
        }
        System.out.println();

        int nrMasini = 2;
        Masina masini[] = new Masina[nrMasini];
        for (int i = 0; i < nrMasini; i++) {
            masini[i] = new Masina("Marca"+i);
        }

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("obiecte.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.write(nrMasini);
            objectOutputStream.writeInt(nrMasini);
            for (int i = 0; i < nrMasini; i++) {
                objectOutputStream.writeObject(masini[i]);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("obiecte.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            int nrMasiniFisier = objectInputStream.readInt();
            System.out.println("Sunt " + nrMasiniFisier + " masini in fisier!");
            for (int i = 0; i < nrMasiniFisier; i++) {
                Masina m = (Masina)objectInputStream.readObject();
                System.out.println(m);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (EOFException exception) {
            System.out.println("EOF Exception: " + exception.getMessage());
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
