import java.util.Scanner;

public class one
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int u;
        double c = 0.0;

        System.out.println("Enter units consumed");
        u = x.nextInt();

        if (u<=100)
        c = 0.5*u;
        else if (u>100 && u<=250)
        c = 100 * 0.5 * (u-100)*1.5;
        else if (u>250 && u<=600)
        c = 100 * 0.5 + 150 *1.5 + (u-250) * 3.5;
        else if (u>600)
        c = 100 * 0.5 + 150 * 1.5 + 350 * (u-600)*5.8;

        c += 200.0;

        System.out.println("Total bill : "+c);

    }
}