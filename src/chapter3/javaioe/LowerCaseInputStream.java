package chapter3.javaioe;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Custom input stream that converts upper case characters to lower case
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int dataByte = this.in.read();
        return dataByte == -1 ? dataByte : Character.toLowerCase((char) dataByte);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = this.in.read(b, off, len);
        for (int i = 0; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
