import java.lang.reflect.Method;

public class UncheckedExceptionExampleReflection {
    public static void main(String[] args) {
        try {
            Class<?> uncheckedExceptionExampleClass = Class.forName("UncheckedExceptionExample");
            Method[] methods = uncheckedExceptionExampleClass.getDeclaredMethods();

            for (Method method : methods) {
                if (method.getName().equals("main")) {
                    Object instance = uncheckedExceptionExampleClass.newInstance();
                    String[] arguments = new String[1];
                    method.invoke(instance, (Object) arguments);
                }
            }
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
