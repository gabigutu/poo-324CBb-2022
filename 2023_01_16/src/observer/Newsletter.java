package observer;

public class Newsletter { // Observer

    private Subscriber[] subscribers;
    private int index = 0;

    public Newsletter() {
        this.subscribers = new Subscriber[100];
    }

    void addSubscriber(Subscriber subscriber) {
        this.subscribers[this.index++] = subscriber;
    }

    void notifySubscribers(String mesaj) {
        for (int i = 0; i < index; i++) {
            this.subscribers[i].primesteMesaj(mesaj);
        }
    }

}
