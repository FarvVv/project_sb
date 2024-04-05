//Создайте метод, который генерирует непроверяемое исключение и вызывает его из другого метода
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            generateUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Исключение было перехвачено: " + e.getMessage());
        }
    }

    public static void generateUncheckedException() {
        throw new RuntimeException("Пример непроверяемого исключения!");
    }
}
