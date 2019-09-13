import java.util.Arrays;
/**
 * クラス Histogram の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Histogram
{
    public static void main(){
        lowAndHigh count = new lowAndHigh();
        /*int[] a = count.randomArray(30);
        int[] counts = new int[100];
        for(int i = 0; i < a.length; i++){
            counts[i] = count.inRange(a, i, i + 1);
            System.out.println("counts[" + i + "] = " + counts[i]);
        }*/
        
        /*int[] b = count.randomArray(20);
        int inRange = count.inRange(b,0,20);
        System.out.println(inRange);*/
        
        int[] c = count.randomArray(20);
        int inRange = count.inRange(c,0,5);
        System.out.println(inRange);
        
        int[] counts = new int[100];
        int[] scores = count.randomArray(100);
        for(int i = 0; i < counts.length; i++){
            int index = scores[i];
            System.out.println(counts[index]++);
        }
        
    }
}
