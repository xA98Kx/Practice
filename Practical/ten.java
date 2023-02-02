import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int l = 4;
        int i =2,j;

        for(i=2; i<=l+1;i++)
        {
            for(j=1; j<=i-1; j++)
            {
                System.out.print(i*j);
            }
            System.out.println();;
        }
    }
}
