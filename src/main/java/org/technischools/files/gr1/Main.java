package org.technischools.files.gr1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile().getAbsolutePath());

//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        System.out.println(string);
        // Odczytywanie z pliku
        // Metoda 1
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Metoda 2
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null){
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();

        // Metoda 3
        List<String> lines = Files.readAllLines(Path.of(file.getAbsolutePath()));
        for (String singleLine: lines) {
            System.out.println(singleLine);
        }

        // Zapisywanie do pliku
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("\nssie");
        fileWriter.flush();
        fileWriter.close();
    }
}
