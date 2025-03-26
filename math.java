import java.util.Scanner;

class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);
        input.close();
        // System.out.println(Math.max(5, 10));
        // System.out.println(Math.min(5, 10));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.abs(-4.7));
        // System.out.println(Math.random());
    }
}