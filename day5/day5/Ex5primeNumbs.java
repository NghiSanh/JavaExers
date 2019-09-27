import java.util.*;
/**
 * クラス primeNumbs の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Ex5primeNumbs
{
    
    public static void main(){
        int n = 30;
        
        for(int i = 1; i < n; i++){
            
                if(isPrime(i)){
                    System.out.println(i + " is prime number");
                
                }
            
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
       }
}


 
