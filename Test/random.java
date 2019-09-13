import java.util.Random;
import java.util.Scanner;

public class random
{
   public static void main(){
       Random random = new Random();
       Scanner scan = new Scanner(System.in);
       
       System.out.println("I'm thinking of a number between 1 and 100");
       System.out.println("Can you guess what it is?");
       int a = scan.nextInt();
       System.out.println("You guess is: " + a);
       int number = random.nextInt(100)+1;
       System.out.println("The number I was thinking of is: " + number);
       int b = a - number;
       System.out.println("You were off by: " + b);
   } 
}
