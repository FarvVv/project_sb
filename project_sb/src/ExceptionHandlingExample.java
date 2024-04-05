//Напишите программу, которая генерирует проверяемое исключение и обрабатывает его с использованием блока try-catch
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерируем исключение
            throw new Exception("Пример проверяемого исключения!");
        } catch (Exception e) {
            // Обрабатываем исключение
            System.out.println("Исключение было перехвачено: " + e.getMessage());
        }
    }
}
