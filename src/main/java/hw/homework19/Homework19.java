package hw.homework19;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Homework19 {

    public static void main(String[] args) {
        File rootDirectory = new File(".");
        File[] files = rootDirectory.listFiles((dir, name) -> name.endsWith(".txt"));

        System.out.println("Список текстовых файлов:");
        for (File file : files) {
            System.out.println(file.getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Содержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        System.out.print("Введите строку для записи в файл: ");
        String input = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(input);
            writer.newLine();
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
        scanner.close();
    }
}
