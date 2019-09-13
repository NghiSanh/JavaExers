import java.util.Arrays;
/**
 * クラス createArray の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class createArray
{
    public static void main(){
        Exer3 ex3 = new Exer3();
        int[] array = ex3.randomArray(10);
        
        System.out.println(Arrays.toString(array));
    }
}
