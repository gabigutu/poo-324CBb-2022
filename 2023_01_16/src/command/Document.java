package command;

import java.util.Arrays;

public class Document {

    public char[] keys;
    public int keyIndex = 0;

    public Document() {
        this.keys = new char[1000];
    }

    @Override
    public String toString() {
        return "Document{" +
                "keys=" + Arrays.toString(keys) +
                ", keyIndex=" + keyIndex +
                '}';
    }
}
