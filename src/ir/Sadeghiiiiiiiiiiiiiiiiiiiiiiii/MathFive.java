package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

import java.util.Scanner;

public class MathFive {

    public static void main(String[] args) {




        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Math.log((1 + (1/i * (Math.pow(i-1, i) / i)))));
        }
    }
}
