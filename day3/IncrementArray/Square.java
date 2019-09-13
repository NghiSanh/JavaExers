
/**
 * クラス Square の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Square
{
    public static void main(){
        int[] a = {1,2,3};
        double b;
        for(int i = 0; i < a.length; i++){
            b = a[i] * a[i];
            System.out.println("Square a[" + i +"]" + " is " + b);
        }
    }
}
