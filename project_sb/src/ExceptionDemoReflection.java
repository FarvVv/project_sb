import java.lang.reflect.Method;

public class ExceptionDemoReflection {
    public static void main(String[] args) {
        try {
            Class<?> exceptionDemoClass = Class.forName("ExceptionDemo");
            Method[] methods = exceptionDemoClass.getDeclaredMethods();

            for (Method method : methods) {
                if (method.getName().equals("main")) {
                    Object instance = exceptionDemoClass.newInstance();
                    String[] arguments = new String[1];
                    method.invoke(instance, (Object) arguments);
                }
            }
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
