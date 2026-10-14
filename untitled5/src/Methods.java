import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitiv egesz szamot:");
        int sumLimit = sc.nextInt();
        System.out.println("Gauss-összeg (0-tól " + sumLimit + "-ig): " + gausSum(sumLimit));

        System.out.println("Adjon meg egy pozitiv egesz szamot:");
        int factNum = sc.nextInt();
        System.out.println("Faktoriális (" + factNum + "!): " + factorial(factNum));

        System.out.println("Adjon meg egy pozitiv egesz szamot:");
        int fibIndex = sc.nextInt();
        System.out.println(fibIndex + ". Fibonacci-szám: " + fibonacci(fibIndex));

        String[] animals = {
                "koal", "pand", "zebr", "anacond", "bo", "chinchill",
                "cobr", "gorill", "hyen", "hydr", "iguan", "impal",
                "pum", "tarantul", "piranh"
        };

        String[] updatedAnimals = appendAFunc(animals);
        System.out.println("Módosított állatnevek: " + Arrays.toString(updatedAnimals));
    }
    public static int gausSum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static long factorial(int number) {
        if (number < 0) {
            System.out.println("A faktoriális nem értelmezett negatív számokra.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
    public static String[] appendAFunc(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + "a";
        }
        return array;
    }
}
