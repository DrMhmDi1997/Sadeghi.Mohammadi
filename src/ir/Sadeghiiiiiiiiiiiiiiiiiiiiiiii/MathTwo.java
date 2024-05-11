package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

public class MathTwo {

    public static void main(String[] args) {

        int cos = 270;

        double Radiancos = Math.toRadians(cos);

        int fact = 1;

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 0) {
                System.out.println(1 - (Math.pow(Radiancos, i) / fact));
            }


        }
    }

    private static int fact (int a) {
        if (a % 2 == 0) {

        }
        return fact(a);
    }
}
