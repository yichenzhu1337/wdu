import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunCommandsTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testRunCommand() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\wamp64\\www\\projects\\drupal-7-responsive\\trunk\\sites\\all\\themes\\springfreev2\" && gulp");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}
