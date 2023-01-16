package command;

public class Main {

    public static void main(String[] args) {
        Document eseu = new Document();
        KeyPressedCommand keyPressedCommandS = new KeyPressedCommand('S');
        keyPressedCommandS.apply(eseu);
        KeyPressedCommand keyPressedCommanda = new KeyPressedCommand('a');
        keyPressedCommanda.apply(eseu);
        KeyPressedCommand keyPressedCommandl = new KeyPressedCommand('l');
        keyPressedCommandl.apply(eseu);

        keyPressedCommandl.undo(eseu);

        ShapeDrawCommand shapeDrawCommand = new ShapeDrawCommand();
        shapeDrawCommand.apply(eseu);



    }
}
