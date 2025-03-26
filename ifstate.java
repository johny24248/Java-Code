import java.util.Scanner;

class ifstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        input.close();
        if (a > b) {
            System.out.println("A is greatest");
        } else {
            System.out.println("B is greatest");
        }
    }

}