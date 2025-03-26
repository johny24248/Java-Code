import java.util.Scanner;

class manyinput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");

        String username = myObj.nextLine();

        System.out.println("Enter your age");

        int age = myObj.nextInt();

        System.out.println("Your name is " + username + " and your age is " + age);
    }
}