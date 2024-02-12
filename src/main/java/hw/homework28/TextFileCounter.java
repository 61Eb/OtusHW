package hw.homework28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileCounter {
    public static void main(String[] args) {
        String fileName = args[0];
        String sequence = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, sequence);
            }

            System.out.println("Последовательность \"" + sequence + "\" встречается " + count + " раз в файле.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static int countOccurrences(String line, String sequence) {
        int count = 0;
        int index = line.indexOf(sequence);

        while (index != -1) {
            count++;
            index = line.indexOf(sequence, index + 1);
        }

        return count;
    }
}