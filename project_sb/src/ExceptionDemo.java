//Напишите код, который демонстрирует разницу между проверяемыми и непроверяемыми исключениями в Java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Проверяемое исключение (checked exception)
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }

        // Непроверяемое исключение (unchecked exception)
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[4]); // Попытка обратиться к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива: " + e.getMessage());
        }
    }
}
