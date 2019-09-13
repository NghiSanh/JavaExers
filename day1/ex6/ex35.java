
/**
 * クラス ex35 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex35
{
    public static void main(){
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 5; b++){
                if(a == 0 && b == 0){
                    System.out.print(" ");
                }
                else if(a == 0 && b == 4){
                    System.out.print(" ");
                }
                else if(a == 4 && b == 4){
                    System.out.print(" ");
                }
                else if(a == 4 && b == 0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
