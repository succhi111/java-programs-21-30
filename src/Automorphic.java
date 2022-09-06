//the last digit of square of the number is same to the given number
//eg:--5^2=25 ,6^2=36

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {

        int p = 0, d = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");

        int n = sc.nextInt();
        int sq = n * n;

        while (p < n) {
            p = sq % d;
            d = d * 10;
        }

        if (p == n)
            System.out.println(n + " is automorphic");
        else
            System.out.println(n + " is not automorphic");
    }
}

