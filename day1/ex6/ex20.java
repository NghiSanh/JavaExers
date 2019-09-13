
/**
 * クラス ex20 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex20
{
    public static void main(){
        for(int a = 1; a < 7; a++){
            for(int b = 1; b < 7; b++){
                if(a == b){
                    System.out.print(b + " ");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
