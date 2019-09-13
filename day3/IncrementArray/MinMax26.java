
/**
 * クラス MinMax の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class MinMax26
{   
    static int max(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    static int min(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(){
        int[] n = { 4, 75, 23, 18, 11, 98 };
        System.out.println(min(n));
        System.out.println(max(n));
    }
}
