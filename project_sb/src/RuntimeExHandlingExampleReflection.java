import java.lang.reflect.Method;

public class RuntimeExHandlingExampleReflection {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } finally {
            System.out.println("Блок finally выполнен.");
        }

        // Проверка исключений через рефлексию
        try {
            Method method = RuntimeExHandlingExample.class.getMethod("divideByZero");
            method.invoke(null);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getCause().getMessage());
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 2;
        return numerator / denominator;
    }
}
