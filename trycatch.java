public class trycatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("An error");
        } finally {
            System.out.println("The error is resolved");
        }

    }
}