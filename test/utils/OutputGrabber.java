package utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputGrabber {
    private ByteArrayOutputStream byteArrayOutputStream;

    public OutputGrabber() {
        byteArrayOutputStream = new ByteArrayOutputStream();
    }

    public PrintStream writer() {
        return new PrintStream(byteArrayOutputStream);
    }

    public String content() {
        return new String(byteArrayOutputStream.toByteArray());
    }
}
