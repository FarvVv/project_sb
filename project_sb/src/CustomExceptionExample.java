public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Это пользовательское исключение!");
        } catch (CustomException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
