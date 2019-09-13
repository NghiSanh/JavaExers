import java.util.Arrays;
/**
 * クラス forecast の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class forecast
{
    public static void main(){
        double[] a = {26.0, 24.5, 22.3};
        //double[] b = Arrays.copyOf(a,3);
        double[] c = Arrays.copyOf(a,2);
        double[] b = new double[3];
        for(int i = 0; i < a.length; i++){
           b[i] =  a[i];
           System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(c));
    }
}
