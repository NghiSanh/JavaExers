import java.util.Scanner;
import java.util.Arrays;
/**
 * @author (Sanh)
 * @version (2019/09/27)
 */
public class Ex6Factors
{
    static void main(){
        int[] a = new int[10];
        for(int k = 1; k < a.length; k++){
            a[k] = k;
        }
        System.out.println(Arrays.toString(a));
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("For n = ");
        n = scan.nextInt();
        
        System.out.println(AreFactors(n,a));
    }
    static boolean AreFactors(int n, int[] a){
        
        for(int i = 0;i < a.length; i++){
            if(a[i] % n == 0){ //a[0] = 0 % 2 
                System.out.println(a[i]);
            }else{
                return false;
            }
        }
        return true;
        
    }
}
