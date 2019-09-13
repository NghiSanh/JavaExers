
/**
 * クラス ex22 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex22
{
    public static void main(){
        int c = 1;
        for(int a = 1; a < 7; a++){
            for(int b = 1;b < 7; b++){
                if(a == b && c < 10){
                    System.out.print(c);
                    c++;
                }
                else if(a + b == 6 && c < 10){
                    System.out.print(c);
                    c++;
                }
                else{
                    System.out.print(" ");
                
                }
            }
            System.out.println();
        }
    }
}
