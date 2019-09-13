
/**
 * クラス ex31 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex31
{
    public static void main(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(x + y != 0 && x + y != 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }
}
