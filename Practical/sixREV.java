import java.util.Scanner;

public class sixREV {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int rev = 0, n,d;
        n = x.nextInt();

        while(n>0)
        {
            d = n%10;
            rev = rev * 10+d;
            n/=10;

        }

        System.out.print(rev);
    }
}
