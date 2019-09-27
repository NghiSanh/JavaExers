
/**
 * クラス ex1x2x の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex1x2x
{
    public static void main(){
        int[] scores = {20,30,40,50};
        hisgram(scores);
        
    }
    static int[] hisgram(int[] scores){
        int[] counts = new int[100];
        for(int score : scores){
            counts[score]++;
            System.out.println("score " + score + " is " + counts[score]);
        }
        return counts;
    }
}
