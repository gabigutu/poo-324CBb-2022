package observer;

public class Subscriber {

    String email;

    public Subscriber(String email) {
        this.email = email;
    }

    public void primesteMesaj(String mesaj) {
        System.out.println(this + " - Mesaj primit: " + mesaj);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "email='" + email + '\'' +
                '}';
    }
}
