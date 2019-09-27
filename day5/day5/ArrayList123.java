import java.util.ArrayList;
import java.util.Random;
/**
 * クラス ArrayList の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ArrayList123
{
    public static void main(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int size = 10;
        for(int i = 0; i < size; i++){
            al.add(randomNumbers(30));
        }
        System.out.println(al);
    }
    static int[] randomArray(int a){
        Random rand = new Random();
        int[] array = new int[a];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }
        return array;
    }
    static int randomNumbers(int elements){
        Random random = new Random();
        int randomNumber = random.nextInt(elements);
        return randomNumber;
    }
}
