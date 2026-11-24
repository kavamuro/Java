import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }

        int greatest = Collections.max(expenses);
        int cheapest = Collections.min(expenses);
        float average = (float) total / expenses.size();

        System.out.println(total);
        System.out.println(greatest);
        System.out.println(cheapest);
        System.out.println(average);
    }
}