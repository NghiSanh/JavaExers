import java.util.Arrays;
/**
 * クラス Exer2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Exer2
{
    public static void main(){
        double[] grades = {98.2, 22.9, 30.0};
        
        double[] scores = Arrays.copyOf(grades,grades.length);
        System.out.println(Arrays.toString(scores));
        
        double[] scores2 = Arrays.copyOf(grades,2);
        System.out.println(Arrays.toString(scores2));
        
        double[] scores4 = Arrays.copyOf(grades,4);
        System.out.println(Arrays.toString(scores4));
    }
}
