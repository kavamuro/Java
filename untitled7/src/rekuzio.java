public class rekuzio {
    static void main() {
        System.out.println(factorial(5));
        System.out.println(power(2, 3));
        System.out.println(fibonacci(5));
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int power(int base ,int n){
        if(n== 0)
            return  1;
        else {
            return base * power(base, n - 1);
        }
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
