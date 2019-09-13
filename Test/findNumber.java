import java.util.Scanner;
public class findNumber{
 public static void main(){
     int number, digit;
     number = 1297;
     
     digit = number %10;
     System.out.println(digit);
     
     number =number /10;
     digit = number % 10;
     System.out.println(digit);
     
     number =number /10;
     digit = number % 10;
     System.out.println(digit);
     
     number =number /10;
     digit = number % 10;
     System.out.println(digit);
    }
}