import java.util.Scanner;
/**
 * Write a description of class ax2x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ax2x
{
    static void main(){
        double a, b, c, x;
        double left,right;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        a = scan.nextDouble();
        System.out.println("b = ");
        b = scan.nextDouble();
        System.out.println("c = ");
        c = scan.nextDouble();
        System.out.println("x = ");
        x = scan.nextDouble();
        
        left = a * Math.pow(x,2) + b * x + c;
        right = 0;
        
    }
}
