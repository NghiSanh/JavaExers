
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    static void main(){
        for(int i = 0; i < 3; i++){
            if(i == 0){
                for(int x = 0; x < 2; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if(i == 1){
                System.out.print(" ");
                System.out.print("*");
                System.out.print(" ");
            } else{
                System.out.print("*");
                for(int y = 0; y < 2; y++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
