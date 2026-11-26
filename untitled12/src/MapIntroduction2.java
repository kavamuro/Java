import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>(
                Map.of(
                        "978-1-60309-452-8", "A Letter to Jo",
                        "978-1-60309-459-7", "Lupus",
                        "978-1-60309-444-3", "Red Panda and Moon Bear",
                        "978-1-60309-461-0", "The Lab"
                )
        );

        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }

        books.remove("978-1-60309-444-3");

        books.values().remove("The Lab");

        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(books.containsKey("478-0-61159-424-8"));
        System.out.println(books.get("978-1-60309-453-5"));
    }
}