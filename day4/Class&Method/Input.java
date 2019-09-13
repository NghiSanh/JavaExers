import java.util.Scanner;
/**
 * クラス Input の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Input
{
    static void input(){
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
    }
    static void main(){
        Input input = new Input();
        input();
    }
}
