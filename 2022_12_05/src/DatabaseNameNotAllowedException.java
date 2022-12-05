public class DatabaseNameNotAllowedException extends Exception {

    private String databaseName;
    private int noUsers;

    public DatabaseNameNotAllowedException(String databaseName, int noUsers) {
        super("Mesaj de eroare la numele bazei de date: " + databaseName);
        this.databaseName = databaseName;
        this.noUsers = noUsers;
    }

    public static void main(String[] args) {
        String databaseName = "2392331";
//        if (databaseName.charAt(0) >='0' && databaseName.charAt(0) <='9') {
        if (databaseName.matches("[0-9]+")) {
            System.out.println("are cifra la inceput");
            try {
                throw new DatabaseNameNotAllowedException("MySQL", 5);
            } catch (DatabaseNameNotAllowedException e) {
                System.out.println("Am primit exceptie: " + e.getMessage());
            }
        } else {
            System.out.println("nu are cifre");
        }
    }

}
