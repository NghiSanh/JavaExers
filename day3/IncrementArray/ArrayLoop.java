import java.util.Arrays;
/**
 * クラス ArrayLoop の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ArrayLoop
{
   public static void main(){
       int[] a = {1,2,3,4,5};
       int b = 1;
       for(int i = 0; i < a.length; i++){
           System.out.println("Number " + b + " is " + a[i]);
           b++;
        } 
       System.out.println(Arrays.toString(a));
       System.out.print("{");
       for(int i = 0; i < a.length; i++){
           System.out.print(a[i] + ", ");
        }
       System.out.print("}"); 
    }
}
