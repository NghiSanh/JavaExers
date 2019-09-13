
/**
 * クラス Exer7 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Exer7
{
    public static int S(int[] array, int target){
       for(int i = 0; i < array.length; i++){
           if(array[i] == target){
               return 1;
            }
        } 
        return -1;
 }
 
 //Main
 public static void main(){
        
        int[] array = {1,2,3,4,5};
        
        System.out.println(S(array,5));
    }
}