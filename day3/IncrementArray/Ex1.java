
/**
 * クラス Ex1 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Ex1
{
    public static void main(){
        int[] num = {2,4,6,8,10};
        
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        
        for(int a = 0; a < num.length; a++){
            num[a]++;
            System.out.println(num[a]);
        }
    }
}
