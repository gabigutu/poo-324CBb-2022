import java.io.Serializable;

public class Masina implements Serializable {

    String marca;

    public Masina(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
