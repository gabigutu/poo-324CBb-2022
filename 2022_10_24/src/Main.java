import auto.Masina;

public class Main {

    public static void main(String[] args) {
	    Masina masina = new Masina();
        masina.afiseaza();
        Masina.afiseazaNumar();

        int x = 5;
        Masina masina1 = new Masina("negru", 1599);
        masina1.afiseaza();
        Masina.afiseazaNumar();

//        masina.capacitate++;
        masina.setCapacitate(masina.getCapacitate() + 1);
        masina.setCuloare("rosu");
        masina.afiseaza();

        System.out.println(masina);

        float numar = Float.parseFloat("833.222");
        System.out.println(numar);

        Float myFloat = new Float("9833.22");
        System.out.println(myFloat.doubleValue());

        int[] xArr = new int[3];
        Masina[] masini = new Masina[3];
        masini[0] = new Masina("albastru", 1999);


    }
}
