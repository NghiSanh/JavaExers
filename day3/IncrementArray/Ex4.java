
/**
 * クラス Ex4 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Ex4
{
    public static void main(){
        int[] numb = {2,4,6,8,10};
        for(int n=0; n < numb.length; n++){
            System.out.print(numb[n] + " - 1 is equal to ");
            numb[n]--;
            System.out.println(numb[n]);
        }
    }
}
