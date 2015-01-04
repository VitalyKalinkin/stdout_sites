package utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public abstract class Utils {
    public static InputStream toStream(String str) {
        return new ByteArrayInputStream(str.getBytes(Charset.forName("utf-8")));
    }
}
