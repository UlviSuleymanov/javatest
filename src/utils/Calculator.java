package utils;

import java.util.Scanner;

public class Calculator {
    public static double MathCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A-ya bir reqem giriniz:");
        double a = sc.nextDouble();
        System.out.println("B-ye bir reqem giriniz:");
        double b = sc.nextDouble();
        System.out.println("Emeliyyati seciniz (1 toplama, 2 cixma, 3 vurma, 4 bolme)");
        int emeliyyat = sc.nextInt();
        double netice;

        switch (emeliyyat) {
            case 1:
                netice = MathUtils.topla(a, b);
                return netice;

            case 2:
                netice = MathUtils.cix(a, b);
                return netice;
            case 3:
                netice = MathUtils.vur(a, b);
                return  netice;
            case 4:
                netice = MathUtils.bol(a, b);
                return netice;
            default:
                netice = 0;
                System.out.println("Emeliyyat seciminden emin olunuz.");
        }

        return netice;
    }
}
