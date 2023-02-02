import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double s=0.0,num=2;
        int eks,n;
        eks = x.nextInt();
        n = x.nextInt();

        for (int i =1; i<=n;i++)
        {
            s = num/Math.pow(eks, i);
            num++;
        }
        System.out.print(s);
    }
    
}
