public class total extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        total thread = new total();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}