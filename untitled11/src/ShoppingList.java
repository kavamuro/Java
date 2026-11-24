import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>(Arrays.asList(
                "eggs", "milk", "fish", "apples", "bread", "chicken"
        ));

        hasItem(shoppingList, "milk");
        hasItem(shoppingList, "bananas");
    }

    public static void hasItem(List<String> list, String item) {
        if (list.contains(item)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}