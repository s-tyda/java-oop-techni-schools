package org.technischools.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/data.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getParentFile().getAbsolutePath());
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println(line);

        // Metoda 1
        try {
            Scanner fileScanner = new Scanner(file);
            int counter = 1;
            while (fileScanner.hasNextLine()) {
                System.out.println(counter);
                String line = fileScanner.nextLine();
                System.out.println(line);
                counter++;
            }
            fileScanner.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        // Metoda 2
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Metoda 3
        List<String> lines = Files.readAllLines(Path.of(file.getAbsolutePath()));
        for (String line:lines) {
            System.out.println(line);
        }

//         Zapisywanie do pliku
        FileWriter fw = new FileWriter(file, true);
        fw.write("\nssie");
        fw.flush();
        fw.close();
    }
}
