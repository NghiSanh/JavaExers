
/**
 * Write a description of class Q3xTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3xTest
{
    static void main(){
        int step = 3;
        for(int x = 0; x < step; x++){
            for(int y = x - 1; y < step - 1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
