package _45_Java_IO._04_CharacterIO_Streams._09_FilterWriter;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class ROT13Writer extends FilterWriter {
    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
    protected ROT13Writer(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        super.write(ROT13.rotate(c));
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        char[] tempBuff = new char[len];
        for (int i = 0; i < len; i++) {
            tempBuff[i] = (char) ROT13.rotate(cbuf[off + i]);
        }
        super.write(tempBuff, 0, len);
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        char[] cbuf = str.toCharArray();
        this.write(cbuf, off, len);
    }
}
