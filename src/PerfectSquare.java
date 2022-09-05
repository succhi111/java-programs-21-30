import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int num = sc.nextInt();

        if (Math.ceil(Math.sqrt(num)) == Math.floor(Math.sqrt(num)))
        {
            System.out.print(num + " is a Perfect Square");
        }
        else
        {
            System.out.print(num
                    + " is not a Perfect Square");
        }
    }

}
