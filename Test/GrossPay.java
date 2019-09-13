import java.util.Scanner;

public class GrossPay
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many hours you worked?");
        int hoursWorked = scan.nextInt();
        System.out.println("How many rate of pay for per hour?");
        double rateOfPay = scan.nextDouble();
        
        System.out.printf("Gross pay:(hours worked) %d * (rate of pay) %.1f =  " + (hoursWorked * rateOfPay), hoursWorked, rateOfPay);
    }
}
