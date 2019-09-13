
/**
 * クラス ex8 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex8
{
    public static void main(){
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                
                if(x == y || x + y == 4){
                    System.out.print("x");
                }
                 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
