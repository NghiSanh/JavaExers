
/**
 * クラス ex34 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex34
{
    public static void main(){
        int c = 0;
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 9; b++){
                if(a == 0 && c < 9){
                    System.out.print("*");
                    
                    
                }
                else if(a == 1 && b > 0 && b < 8){
                   System.out.print("*");
                }
                else if(a == 2 && b > 1 && b < 7){
                   System.out.print("*");
                }
                else if(a == 3 && b > 2 && b < 6){
                   System.out.print("*");
                }
                else if(a == 4 && b > 3 && b < 5){
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
