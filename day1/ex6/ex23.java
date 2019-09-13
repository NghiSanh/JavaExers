
/**
 * クラス ex23 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex23
{
    public static void main(){
        String a,b;
        a = "Fizz"; b = "Buzz";
        
        for(int x = 1; x < 16; x++){
            if(x == 3 || x == 6 || x == 9 || x == 12){
                System.out.print(a + " ");
            }
            else if( x == 5 || x == 10){
                System.out.print(b + " ");
            }
            else if( x == 15){
                System.out.print(a + " " + b);
            }
            else{
                System.out.print(x + " ");
            }
        }
    }
}
