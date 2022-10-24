package auto;

public class Masina {

    private String culoare;
    private int capacitate;
    static int numarMasini = 0;

    public Masina() {
        this("alb", 1399);
    }

    public Masina(String culoare, int capacitate) {
        this.culoare = culoare;
        this.capacitate = capacitate;
        numarMasini++;
        this.metodaPrivata();
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void afiseaza() {
        System.out.println("Autoturism: " + this.culoare + ", " + this.capacitate + " cmc");
        this.metodaPrivata();
    }

    public static void afiseazaNumar() {
        System.out.println("Numar masini: " + Masina.numarMasini);
//        System.out.println(this.culoare);
    }

    private void metodaPrivata() {
        System.out.println("Metoda privata pentru masina de culoare " + this.culoare);
    }

//    Pacienti[] pacienti = new Pacienti[100];
//    public void adaugaPacient(Pacient pacinet) {
//        pacienti[numarPacienti] = pacient;
//        numarPacienti++;
//    }




}
