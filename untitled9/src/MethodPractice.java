public class MethodPractice {
    public static void main(String[] args) {

        System.out.println("1. feladat:");
        System.out.println(szogElnevezes(-5));   // negatív szög
        System.out.println(szogElnevezes(0));    // nullszög
        System.out.println(szogElnevezes(45));   // hegyes szög
        System.out.println(szogElnevezes(90));   // derék szög
        System.out.println(szogElnevezes(120));  // tompa szög
        System.out.println(szogElnevezes(180));  // egyenesszög
        System.out.println(szogElnevezes(200));  // homorú szög
        System.out.println(szogElnevezes(360));  // teljes szög
        System.out.println(szogElnevezes(400)); // nagyobb mint teljes szog

        System.out.println("\n2. feladat:");
        System.out.println(hasEightTheSqrt(64)); // true (gyöke 8.0)
        System.out.println(hasEightTheSqrt(9));  // false (gyöke 3.0)

        System.out.println("\n4. feladat:");
        System.out.println(bodyMassIndexResult(70, 1.75));

        System.out.println("\n3. feladat:");
        System.out.println(isValidPassword("ABcd1!")); // true (2 nagy, 2 kis, 1 szám, 1 spec)
        System.out.println(isValidPassword("Abc1!"));  // false
    }
    public static String szogElnevezes(double szog) {
        if (szog < 0) {
            return "negatív szög";
        } else if (szog == 0) {
            return "nullszög";
        } else if (szog < 90) {
            return "hegyes szög";
        } else if (szog == 90) {
            return "derék szög";
        } else if (szog < 180) {
            return "tompa szög";
        } else if (szog == 180) {
            return "egyenesszög";
        } else if (szog < 360) {
            return "homorú szög";
        } else if (szog == 360) {
            return "teljes szög";
        } else {
            return "nagyobb, mint a teljes szög";
        }
    }
    public static boolean hasEightTheSqrt(int szam) {
        if (szam < 0) {
            return false;
        }
        double gyok = Math.sqrt(szam);
        return String.valueOf(gyok).contains("8");
    }
    public static String bodyMassIndexResult(double kg, double m) {
        double bmi = kg / (m * m);

        if (bmi < 18.5) {
            return "Alacsony testsúly alatti kategória";
        } else if (bmi < 25.0) {
            return "Normál testsúlyú kategória";
        } else if (bmi < 30.0) {
            return "Túlsúlyos kategória";
        } else if (bmi < 35.0) {
            return "Elhízás (I. fokú) kategória";
        } else if (bmi < 40.0) {
            return "Elhízás (II. fokú) kategória";
        } else {
            return "Súlyos elhízás (III. fokú) kategória";
        }
    }
    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }

        int kisbetu = 0;
        int nagybetu = 0;
        int szam = 0;
        int specialis = 0;

        String specialisKarakterek = ".-*#@!";

        for (char x : password.toCharArray()) {
            if (Character.isLowerCase(x)) {
                kisbetu++;
            } else if (Character.isUpperCase(x)) {
                nagybetu++;
            } else if (Character.isDigit(x)) {
                szam++;
            } else if (specialisKarakterek.contains("" + x)) {
                specialis++;
            }
        }

        return kisbetu >= 2 && nagybetu >= 2 && szam >= 1 && specialis >= 1;
    }
}
