package app.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

public class MyWriter {
    public static void main(String[] args) throws IOException {
        //? Into the stream
        FileOutputStream fos = new FileOutputStream(args[0]);
        
        //? Cipher - Does not work without the cipher (Encrupt it)
        // CipherOutputStream cis = new CipherOutputStream(fos);
        
        //? Goes out of the stream, Create object Output stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //? Number of lines
        oos.writeInt(2);
        oos.writeUTF("She sells sea shell on the seashore \n");
        oos.writeUTF("Big black bug \n");

        oos.flush();
        fos.close();
        
    }
}
