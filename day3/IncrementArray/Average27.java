
/**
 * クラス Average の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Average27
{
    static double arg(double[] array){
        
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }
    public static void main(){
        double[] n = { 45.0, 76.0, 23.0, 8.0, 12.0, 1.0 };
        
        System.out.println(arg(n));
    }
}
