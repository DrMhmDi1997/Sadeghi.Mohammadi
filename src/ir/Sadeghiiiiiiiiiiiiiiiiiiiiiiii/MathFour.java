package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

import java.util.Scanner;

public class MathFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int X = sc.nextInt();

int fact = 1;
        for (int i = 1; i <= 20 ; i++) {
            fact = fact * i;
            System.out.println(1 + (Math.pow(X,i) / fact));
        }
    }
}
