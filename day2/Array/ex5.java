
/**
 * クラス ex5 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex5
{
    public static void main(){
        /*int[] scores = new int[6];
        scores[0] = 1;
        scores[1] = 1;
        scores[2] = 1;
        scores[3] = 1;
        scores[4] = 1;
        scores[5] = 1;*/
        int[] scores = {1,2,3,4,5,6};
        for(int index = 0; index < scores.length; index++){
            System.out.println("Element "+ index + " = " +scores[index]);
        }
    }
}
