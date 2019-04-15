package decoratorpattern.myinputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Sui
 * @date 2018/6/22 15:08
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read == -1 ? read : Character.toLowerCase((char) read);
    }

    @Override
    public int read(byte[] b) throws IOException {
        int read = super.read(b);
        return read == -1 ? read : Character.toLowerCase((char) read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for(int i = off; i < off + read; i++){
            b[i] = (byte)Character.toLowerCase((char) read);
        }
        return read;
    }
}
