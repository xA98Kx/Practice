import java.util.Scanner;

public class uaubef {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i,j;
        for (i=1; i<=5; i++)
        {
            for (j=5; j>=i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
