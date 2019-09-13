import java.util.Scanner;

public class Tax
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        double pstPayalbe, gstPayable, price,finalprice;
        System.out.println("How much have you paid for?");
        price = scan.nextDouble();
        pstPayalbe = price * 0.05;
        gstPayable = price * 0.08;
        finalprice = pstPayalbe + gstPayable + price;
        System.out.printf("final price is %.1f",finalprice);
    }
}
