public class overloading {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.5, 2.5};

        System.out.println(addNumberToArraySum(5, intArray));
        System.out.println(addNumberToArraySum(10, doubleArray));
        System.out.println(addNumberToArraySum(10.5, intArray));
        System.out.println(addNumberToArraySum(10.5, doubleArray));
    }
    public static int addNumberToArraySum(int number, int[] array) {

        if (array != null) {
            for (int val : array) {
                number += val;
            }
        }
        return number;
    }

    public static double addNumberToArraySum(int number, double[] array) {
        double sum = number;
        if (array != null) {
            for (double val : array) {
                sum += val;
            }
        }
        return sum;
    }

    public static double addNumberToArraySum(double number, int[] array) {
        double sum = number;
        if (array != null) {
            for (int val : array) {
                sum += val;
            }
        }
        return sum;
    }

    public static double addNumberToArraySum(double number, double[] array) {

        if (array != null) {
            for (double val : array) {
                number += val;
            }
        }
        return number;
    }
}
