public class MethodPractice2 {
    public static void main(String[] args) {
        System.out.println(negyzetTerulet(2, 3)); // 6
        System.out.println(negyzetTerulet(0, 3)); // 0
        System.out.println(negyzetTerulet(2, 0)); // 0
        System.out.println(negyzetTerulet(-2, 3)); // -1
        System.out.println(negyzetTerulet(2, -3)); // -1
        System.out.println(negyzetTerulet(-2, -3)); // -1
        System.out.println(harmadikSzog(20, 30)); // 130
        System.out.println(harmadikSzog(30, 40)); // 110
        System.out.println(harmadikSzog(90, 90)); // -1
        System.out.println(harmadikSzog(80, 120)); // -1
        System.out.println(harmadikSzog(0, 45)); // -1
        System.out.println(harmadikSzog(45, 0)); // -1
        System.out.println(harmadikSzog(-45, 45)); // -1
        System.out.println(harmadikSzog(45, -45)); // -1
        System.out.println(vanNagybetu("Alma")); // true
        System.out.println(vanNagybetu("alma")); // false
        System.out.println(vanNagybetu("alMa")); // true
        System.out.println(vanNagybetu("123")); // false
        System.out.println(vanNagybetu("")); // false
        System.out.println(fejVagyIras(3)); // "fej"
        System.out.println(fejVagyIras(10)); // "fej"
        System.out.println(fejVagyIras(-3)); // "iras"
        System.out.println(fejVagyIras(-10)); // "iras"
        System.out.println(fejVagyIras(0)); // "elere esett"

    }
    public static double negyzetTerulet (int a, int b){
        if(a == 0 || b == 0) return 0;
        if(a < 0 || b < 0) return -1;
        return a*b;
    }

    public static double harmadikSzog(int a, int b){
        if(a == 0 || b == 0) return 0;
        if(a < 0 || b < 0 || 180 - a - b <= 0 ) return -1;
        return 180 - a - b;
    }
    public static boolean vanNagybetu(String text){
        return !text.equals(text.toLowerCase());
    }
    public static String fejVagyIras(int num){
        if (num > 0) {
            return "fej";
        } else if (num < 0) {
            return "iras";
        } else {
            return "elere esett";
        }
    }
}
