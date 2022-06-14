package app.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        ObjectInputStream ois = new ObjectInputStream(fis);

        int num = ois.readInt();
        System.out.printf("There are %s num in the file", num);
        for (int i = 0; i < num; i++) {
            String line = ois.readUTF();
            System.out.printf("%d: %s\n", i, line);
        }

        fis.close();
    }
}
