package command;

public class KeyPressedCommand extends Comanda {

    char key;

    public KeyPressedCommand(char key) {
        this.key = key;
    }

    @Override
    void apply(Document document) {
        document.keys[document.keyIndex++] = key;
        System.out.println(document);
    }

    @Override
    void undo(Document document) {
        document.keys[document.keyIndex] = '\0';
        document.keyIndex--;
        System.out.println(document);
    }
}
