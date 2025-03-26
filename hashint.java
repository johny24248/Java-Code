import java.util.HashMap;

public class hashint {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Aquin", 26);
        people.put("George", 25);
        people.put("Johny", 27);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " age : " + people.get(i));
        }
    }
}