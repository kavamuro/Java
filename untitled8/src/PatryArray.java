import java.util.Arrays;

public class PatryArray {
    public static void main(String[] args) {
        System.out.println("PartyValidation");
        System.out.println(partyValidation(11, 11).equals("The party is excellent!"));
        System.out.println(partyValidation(11, 12).equals("Quite a cool party!"));
        System.out.println(partyValidation(9, 9).equals("Average party..."));
        System.out.println(partyValidation(9, 10).equals("Average party..."));
        System.out.println(partyValidation(0, 25).equals("Sausage party"));
        System.out.println("Dividable");
        System.out.println(dividable(24, 4, 5) == 4);
        System.out.println(dividable(30, 4, 5) == 5);
        System.out.println(dividable(40, 4, 5) == 20);
        System.out.println(dividable(54, 4, 5) == -1);
    }


        public static String partyValidation(int girls, int boys) {
            if (girls == 0) {
                return "Sausage party";
            } else if (girls + boys < 20) {
                return "Average party...";
            } else if (girls == boys) {
                return "The party is excellent!";
            } else {
                return "Quite a cool party!";
            }
            }

    public static int dividable(int num, int fizz, int buzz) {
        if (num % fizz == 0 && num % buzz == 0) {
            return fizz * buzz;
        } else if (num % fizz == 0) {
            return fizz;
        } else if (num % buzz == 0) {
            return buzz;
        } else {
            return -1;
        }
    }

}
