import java.util.Scanner;

public class ThreePELL {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int f=1,s=2,t,c,n;
        System.out.println("Enter number of terms");
        n = x.nextInt();
        System.out.print(f+","+s);
        for(int i =1 ; i<=n-2; i++)
        {
            //c = f+s;
            t = s*2+f;
            System.out.print(","+t+",");
            f=s;
            s=t;
        }
    }
}
