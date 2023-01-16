package command;

public abstract class Comanda {
    abstract void apply(Document document);
    abstract void undo(Document document);
}
