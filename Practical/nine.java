import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        for (int i = 1; i<= 5 ; i++)
        {
            for (int j = 1; j<= i; j++)
            {
                if (i%2 == 0)
                System.out.print("0");
                else
                System.out.print("1");

            }
            System.out.println();
        }
    }
}
