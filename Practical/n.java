import java.util.Scanner;

class n{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

    int i, sum = 1;
    int n = x.nextInt();
    for (i=0; i<=n-1; i++)
    {
        sum += i;
        System.out.println(sum);
    }
    }
    
}