public class throwing {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied -  You must be atleast 18 years old.");
        } else {
            System.out.println("Access granted - you are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}