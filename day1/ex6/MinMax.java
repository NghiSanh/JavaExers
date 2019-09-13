
/**
 * クラス ex26 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class MinMax{
   public static int min(int[] array){
        int min = array[0];
        for(int i = 0; i <array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
   public static int max(int[] array){
        int max = 0;
        for(int i = 0;i <array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
   public static void main(){
       int[] i = {4, 75, 23, 18, 11, 98};
       MinMax m = new MinMax();
       System.out.println("Max is " + m.max(i));
       System.out.println("Min is " + m.min(i));
    }
}
