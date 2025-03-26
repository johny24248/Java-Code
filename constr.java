public class constr {
    int x;
    String name;

    public constr() {
        x = 5;
        name = "Johny";
    }

    public static void main(String[] args) {
        constr myObj = new constr();
        System.out.println(myObj.x);
        System.out.println(myObj.name);
    }
}