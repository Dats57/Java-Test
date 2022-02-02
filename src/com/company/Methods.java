package com.company;
import java.io.*;

public class Methods {
    public static void serialize(Serializable object, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
        os.close();
    }

    public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable object = (Serializable) ois.readObject();
        ois.close();
        is.close();

        return object;
    }
}
