import java.lang.reflect.Method;

public class ExceptionHandlingExampleReflection {
    public static void main(String[] args) {
        try {
            Class<?> exceptionHandlingExampleClass = Class.forName("ExceptionHandlingExample");
            Method[] methods = exceptionHandlingExampleClass.getDeclaredMethods();

            for (Method method : methods) {
                if (method.getName().equals("main")) {
                    Object instance = exceptionHandlingExampleClass.newInstance();
                    String[] arguments = new String[1];
                    method.invoke(instance, (Object) arguments);
                }
            }
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}

