import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Пользователь вводит 5 названий файлов. Они могут повторяться.
        // Сохраните в каждый из файл названия ВСЕХ 5 файлов, используйте try with resources
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(input))) {
                writer.write(input);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}