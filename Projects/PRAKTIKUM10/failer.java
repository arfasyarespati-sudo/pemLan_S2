package Projects.PRAKTIKUM10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class failer {
    public static void main(String[] args) throws IOException {
        var filename = "lololo.txt";

        var reader = new FileReader(filename);
        var buffer = new BufferedReader(reader);

        var line = buffer.readLine();
        while (line != null) {
            System.out.println(line);
            line = buffer.readLine();
        }

        buffer.close();
    }
}
