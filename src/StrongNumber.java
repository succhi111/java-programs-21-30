import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number to check strong number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int d;

        while (n > 0) {
            int f = 1;
            d = n % 10;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        if (num == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }

    }
}