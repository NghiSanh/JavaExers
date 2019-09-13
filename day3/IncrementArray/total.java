
/**
 * クラス total の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class total
{
    public static void main(){
        int[] array = {1,2,3,4,5};
        System.out.println(sum(array));
    }
    public static int sum(int[] a){
        int Sum = 0;
        for(int i = 0; i < a.length; i++){
            Sum += a[i];
        }
        return Sum;
    }
}
