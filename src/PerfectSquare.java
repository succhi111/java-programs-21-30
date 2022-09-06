//eg:-2*2=4 ,3*3=9 ,4*4=16
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int num = sc.nextInt();
        int sqroot=(int)Math.sqrt(num);

        if (sqroot*sqroot==num)
        {
            System.out.print(num + " is a Perfect Square");
        }
        else
        {
            System.out.print(num + " is not a Perfect Square");
        }
    }

    }
