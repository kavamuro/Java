public class MetodusokDolgozat {
    public static void main(String[] args) {
        System.out.println(masodfokuMegoldasSzam(0, 6, 5));
        System.out.println(masodfokuMegoldasSzam(0, 1, 1));
        System.out.println(masodfokuMegoldasSzam(1, 3, 4));
        System.out.println(masodfokuMegoldasSzam(2, 4, 3));
        System.out.println(masodfokuMegoldasSzam(2, -4, 2));
        System.out.println(masodfokuMegoldasSzam(1, -2, 1));
        System.out.println(masodfokuMegoldasSzam(1, 0, -4));
        System.out.println(masodfokuMegoldasSzam(2, 2, -2));
        System.out.println(vanKisbetu("alma"));
        System.out.println(vanKisbetu("ALmA"));
        System.out.println(vanKisbetu("ALMA"));
        System.out.println(vanKisbetu(""));
        System.out.println(vanKisbetu("123456"));
        System.out.println(getMeret(100));
        System.out.println(getMeret(150));
        System.out.println(getMeret(156));
        System.out.println(getMeret(160));
        System.out.println(getMeret(166));
        System.out.println(getMeret(170));
        System.out.println(getMeret(176));
        System.out.println(getMeret(180));
        System.out.println(getMeret(186));
        System.out.println(getMeret(190));
        System.out.println(getMeret(200));
        System.out.println(rubikKockaSzin(1));
        System.out.println(rubikKockaSzin(2));
        System.out.println(rubikKockaSzin(3));
        System.out.println(rubikKockaSzin(4));
        System.out.println(rubikKockaSzin(5));
        System.out.println(rubikKockaSzin(6));
        System.out.println(rubikKockaSzin(7));
        System.out.println(rubikKockaSzin(-1));
    }

public static int masodfokuMegoldasSzam(int a, int b, int c){
        if (a== 0) return -1;

        double diszk =  b * b - 4 * a * c;
    if (diszk > 0) {
        return 2;
    } else if (diszk == 0) {
        return 1;
    } else {
        return 0;
    }

}

    public static String rubikKockaSzin(int roll) {
        switch (roll) {
            case 1:
                return "yellow";
            case 2:
                return "red";
            case 3:
                return "orange";
            case 4:
                return "white";
            case 5:
                return "blue";
            case 6:
                return "green";
            default:
                return "invalid parameter";
        }
    }
    public static String getMeret(double size) {
        if (size < 150) {
            return "XS";
        } else if (size  < 160) {
            return "S";
        } else if (size < 170) {
            return "M";
        } else if (size < 180) {
            return "L";
        } else if (size < 190) {
            return "XL";
        } else {
            return "XXL";
        }
    }
    public static boolean vanKisbetu(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
