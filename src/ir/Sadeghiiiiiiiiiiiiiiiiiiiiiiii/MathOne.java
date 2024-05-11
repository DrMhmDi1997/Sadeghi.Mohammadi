package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

public class MathOne {

    public static void main(String[] args) {

        int sin = 45;

        double SinRadian = Math.toRadians(sin);

     int fact = 1;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Math.pow(SinRadian, (2 * i -1) / fact));
        }
    }

    private static int fact(int i) {
        return fact(2 * i -1);
    }
}
