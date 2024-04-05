import java.lang.reflect.Constructor;

public class CustomExceptionReflection {
    public static void main(String[] args) {
        Class<?> customExceptionClass = CustomException.class;

        // Проверка имени класса
        System.out.println("Имя класса: " + customExceptionClass.getName());

        // Получение конструкторов класса
        Constructor<?>[] constructors = customExceptionClass.getConstructors();
        System.out.println("Конструкторы класса:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Проверка, является ли класс исключением
        if (Exception.class.isAssignableFrom(customExceptionClass)) {
            System.out.println("Класс является исключением.");
        } else {
            System.out.println("Класс не является исключением.");
        }
    }
}
