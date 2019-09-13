
/**
 * クラス ex24 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex24
{
    public static void main(){
        String a,b;
        a = "Pine";
        b = "Apple";
        for(int x = 1; x < 15; x++){
            if(x == 2 || x== 4 || x == 6 || 
                x == 8 || x == 10 || x ==12){
             System.out.print(a + " ");   
        }
        else if(x == 7){
            System.out.print(b + " ");
        }
        else if(x == 14){
            System.out.print(a + b);
        }
        else{
            System.out.print(x + " ");
        }
    }
 }
}