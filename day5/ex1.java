
/**
 * クラス ex1 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex1
{
    public static double powArray(double[] array){
        
        for(int i = 0; i < array.length; i++){
            array[i] = Math.pow(array[i],2.0);
            System.out.println(array[i]);
        }
        return 1;
    }
    static void main(){
        double[] a = {2,3,4,5};
        powArray(a);
    }
}
