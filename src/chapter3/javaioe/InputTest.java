package chapter3.javaioe;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * To test out custom InputStream
 */
public final class InputTest {

    /**
     * Private empty Constructor
     */
    private InputTest() {
        // empty
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException if there's an IOE Exception
     */
    public static void main(String[] args) throws IOException {
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/chapter3/javaioe/test.txt")));
        int resultByte;
        while ((resultByte = in.read()) >= 0) {
            System.out.println((char) resultByte);
        }
        in.close();
    }
}
