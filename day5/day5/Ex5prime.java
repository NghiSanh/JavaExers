import java.util.*;
/**
 * @author (Sanh)
 * @version (2019/09/27)
 */
public class Ex5prime
{
    static void main(){
        int[] n = new int[30];
        for(int i = 0; i < n.length; i++){
            n[i] = i;
        }
       
        for(int j = 1; j <n.length; j++){
            if(isPrime(n,j)){
                System.out.println(j);
            }
        }
    }
    static boolean isPrime(int[] n,int j){
        if(n[j] <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n[j]); i++){
            if(n[j] % i == 0){
                return false;
            }
        }
        return true;
    }
}
