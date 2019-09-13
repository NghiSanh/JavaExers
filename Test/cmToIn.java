import java.util.Scanner;

public class cmToIn
{
   public static void main(){
       Scanner scan = new Scanner(System.in);
       double cm,in;
       System.out.print("How many cm you want to convert to in: ");
       cm = scan.nextFloat();

       in = cm / 2.54;
       System.out.printf("%.2f inches",in);
   } 
}
