import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter amount to be wihdrawn");
        int amt = 0;
        amt = x.nextInt();

        int tk=0,f=0,t=0,h=0,ft=0,tt=0,tn=0;

        if (amt>=2000)
        {
            tk = amt/2000;
            amt %= 2000;
        }
        if (amt>= 500)
        {
            f = amt/500;
            amt %= 500;
        }
        if (amt>=200)
        {
            t = amt/200;
            amt%= 200;
        }
        if (amt>=100)
        {
            h = amt/100;
            amt %= 100;
        }
        if (amt>=50)
        {
            ft = amt/50;
            amt %= 50;
        }
        if (amt>=20)
        {
            tt = amt/20;
            amt %= 20;
        }
        if (amt>=10)
        {
            tn = amt/10;
            amt %= 10;
        }
        System.out.println("Rs 2000: "+tk+"\n"+"Rs 500: "+f+"\n"+"Rs 200: "+t+"\n"+"Rs 100: "+h+"\n"+"Rs 50: "+ft+"\n"+"Rs 20: "+tt+"\n"+"Rs 10: "+tn);
        System.out.print("Unpaid: Rs"+amt);

    }
}
