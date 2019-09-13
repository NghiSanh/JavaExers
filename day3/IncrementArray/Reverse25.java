import java.util.Arrays;
/**
 * クラス Reverse25 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Reverse25
{
    public static void main(){
        int[] n = { 12, 32, 43, 8, 42, 90 };
        int[] z = new int[6];
        int c = 0;
        System.out.println(Arrays.toString(n));

            for(int b = 5; b >= 0; b--){
                
               z[c] = n[b];
               c++;
            }
            
        System.out.println(Arrays.toString(z));
        }
        
    }

