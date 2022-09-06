//sum of digits of the number is completely devide by number
//eg:- 126=1+2+6=9 and 126%9=0

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int n = sc.nextInt();

        int num = n;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        if (n % sum == 0)
            System.out.println(n + " is Harshad number");
        else
            System.out.println(n + " is not a Harshad number");
    }
}
