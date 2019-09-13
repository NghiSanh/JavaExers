


public class IntergerArithmetic
{
    public static void main(){
       int  number, digit;
        number = 1297;
       digit = number % 10; /* 7 */
       System.out.println(digit);
       
       number = number / 10; /* 129 */
       digit = number % 10; /* 9 */
       System.out.println(digit);
       
       number = number / 10; /* 12 */
       digit = number % 10; /* 2 */
       System.out.println(digit);
       
       number = number / 10; /* 1 */
       digit = number % 10; /* 1 */
       System.out.println(digit);
    }
}
