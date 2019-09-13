import java.util.Arrays;
/**
 * クラス getMiddle30 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class getMiddle30
{
    public static void main(){
        int[] n = { 4, 10, 8, 2, 1, 6, 3, 5, 7, 9 };
        
        System.out.println(Arrays.toString(n));
        System.out.println("The length of array n is " + n.length);
        
        System.out.println("And the middle value is "+  n[n.length / 2]);
        System.out.println("And the middle value is "+  n[9 / 2]);
     }
}
