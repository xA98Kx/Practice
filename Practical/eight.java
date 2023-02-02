import java.util.Scanner;

public class eight
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i,j=1,n = 7;

        for(i=7; i>=1; i-=2)
        {
            for (j = 1; j <= n; j++)
            {
                System.out.print(j);
            }
            n -=2;
            System.out.println();
        }

    }
}