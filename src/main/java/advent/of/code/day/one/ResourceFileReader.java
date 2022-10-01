package advent.of.code.day.one;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ResourceFileReader {

    public String read(String filename) throws IOException {
        URL resource = Resources.getResource(filename);
        return Resources.toString(resource, StandardCharsets.UTF_8);
    }
}
