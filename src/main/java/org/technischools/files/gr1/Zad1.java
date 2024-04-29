package org.technischools.files.gr1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/data.txt");
//        Scanner fileScanner = new Scanner(file);
//        FileWriter fileWriter = new FileWriter("src/main/resources/copy.txt");
//        while (fileScanner.hasNextLine()){
//            fileWriter.write(fileScanner.nextLine());
//            fileWriter.write("\n");
//        }
//        fileScanner.close();
//        fileWriter.close();

        FileReader fileReader = new FileReader(file, StandardCharsets.ISO_8859_1);
        int buffer = fileReader.read();
        while (buffer != -1){
            System.out.println((char) buffer);
            buffer = fileReader.read();
        }
    }
}
