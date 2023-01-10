import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> toy = new HashMap<String, String>();
        toy.put("Car", "Plastic");
        toy.put("Lego", "Plastic");
        toy.put("Train", "Wood");

            for (Map.Entry<String, String> entry : toy.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " is made by " + value);
            }
            for (String key : toy.keySet()) {
                System.out.println("-Toy-: " + key);
        }
            for (String value : toy.values()) {
                System.out.println("-Materials-: " + value);
        }
    }
}

