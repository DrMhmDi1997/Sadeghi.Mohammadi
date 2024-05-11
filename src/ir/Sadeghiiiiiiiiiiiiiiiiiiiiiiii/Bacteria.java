package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

public class Bacteria {
    public static void main(String[] args) {

    double A = 0.0289;
    int t = 5;
    int fact = 1;

        for (int i = 1; i <= 9 ; i++) {
            fact = fact * i;
            System.out.println(1 + (A * t) + (Math.pow((A * t), i) / fact));

        }

}

    }
