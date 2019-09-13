import java.util.Random;
import java.util.Arrays;
/**
 * クラス rannnn の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class rannnn
{
    public static int[] randomArray(int a){
        Random random = new Random();
        int[] x = new int[a];
        for(int i = 0; i < x.length; i++){
            x[i] = random.nextInt(100);
            
        }
        return x;
    }
    public static void main(){
       
       System.out.println(Arrays.toString(randomArray(100)));
    }
}
