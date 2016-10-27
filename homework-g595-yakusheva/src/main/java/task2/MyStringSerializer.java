package task2;

import java.io.*;

/**
 * Created by Софья on 26.10.2016.
 */
public class MyStringSerializer implements MyFirstSerializerInterface<String> {
    @Override
    public void serializeToStream(OutputStream outputStream, String o) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(o);
    }

    @Override
    public String deserializeFromStream(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        return dataInputStream.readUTF();
    }
}
