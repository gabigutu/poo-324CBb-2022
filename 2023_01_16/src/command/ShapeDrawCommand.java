package command;

public class ShapeDrawCommand extends Comanda {
    @Override
    void apply(Document document) {
        System.out.println("Shape drawn in " + document);
    }

    @Override
    void undo(Document document) {
        System.out.println("Shape erased in " + document);
    }
}
