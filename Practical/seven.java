import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        /* 7531
         * 531
         * 31
         * 1
         */

         int r = 4,n = 7, i, j=7;
         for ( i=7 ; i>=1 ; i-=2) {

            for ( j=i ; j>=1 ; j-=2) {
    
                System.out.print(j);
    
            }
    
            System.out.println(" ");
    
        }
        
    }
}
