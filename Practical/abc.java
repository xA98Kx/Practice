import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i,j,r;
        for (i=5; i>=1; i--)
        {
            for (j = 1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
