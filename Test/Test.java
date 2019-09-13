import java.util.Scanner;
public class Test
{
    public static void main(){
        String  message = "Hello World"; //Question 1
        System.out.println(message);
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello "+name);
        
            name = scan.nextLine();
        System.out.println("My friend's name is "+ name);
    }
}
