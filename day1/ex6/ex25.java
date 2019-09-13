
/**
 * クラス ex25 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex25
{
    public static void main(){
        int[] n = {12, 32, 43, 8, 42, 90};
        System.out.println("My length of n = " + n.length);
        //for(int index = 0; index < n.length ; index++){
        //    System.out.println("Element " + index + " = " + n[index]);  
        //}
        for(int index = 6; index >= n.length ; index--){
            System.out.println("Element " + index + " = " + n[index]);  
        }
    }
}
