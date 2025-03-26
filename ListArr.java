import java.util.ArrayList;

public class ListArr {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(1, "Mazda");
        System.out.println(cars);
    }
}