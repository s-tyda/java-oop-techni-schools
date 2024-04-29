package org.technischools.files.gr2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/data.txt");
//        FileReader fileReader = new FileReader(file, Charset.forName("Cp1250"));
        FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
        int buffer = fileReader.read();
        while (buffer != -1){
            char character = (char) buffer;
            System.out.println(buffer);
            System.out.println(character);
            buffer = fileReader.read();
        }

    }
}
