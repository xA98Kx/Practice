import java.util.Scanner;

public class fiveWHILE {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n, s=0,d;
        System.out.print("Enter n   ");
        n = x.nextInt();

        while(n>0)
        {
            d = n%10;
            s += d*d*d;
            n /= 10;
        }
        System.out.print(s);
    }
}
