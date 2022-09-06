//The sum of factors is greater than number
//eg:--12 is devide by 1,2,3,4,6--sum=16 which is greater than 12


import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();

        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
            if (sum > num)
                System.out.println("Abundant number");
            else
                System.out.println("Not an Abundant number");
        }
    }


