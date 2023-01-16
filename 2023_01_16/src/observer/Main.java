package observer;

public class Main {

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        Subscriber vasile = new Subscriber("vasile@yahoo.com");
        Subscriber gigel = new Subscriber("gigel@gmail.com");
        newsletter.addSubscriber(vasile);
        newsletter.addSubscriber(gigel);
        newsletter.notifySubscribers("Bine ati venit!");
        newsletter.notifySubscribers("Reducere  de Black Friday");
    }


}
