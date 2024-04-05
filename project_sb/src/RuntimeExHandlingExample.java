//Реализуйте программу, которая вызывает ошибку времени выполнения и обрабатывает ее с помощью конструкции try-catch-finally
public class RuntimeExHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 2;
        return numerator / denominator;
    }
}
