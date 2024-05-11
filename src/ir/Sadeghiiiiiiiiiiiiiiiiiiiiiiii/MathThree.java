package ir.Sadeghiiiiiiiiiiiiiiiiiiiiiiii;

import java.util.Scanner;

public class MathThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int X = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0) {
                System.out.println(Math.log(2 * (1/i * Math.pow(X-1/X+1, i))));
            }
        }
    }
}
