
/**
 * クラス ex33 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex33
{
    public static void main(){
       
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 9 ; y++){
                if(x == 4 || x + y == 4 || y == 4 ){
                    System.out.print("*");
                    
                }
                
                //Left side
                
                else if(x == 3 && y == 2){
                    System.out.print("*");
                }
                else if(y == 3 && x == 2){
                    System.out.print("*");
                }
                else if( x == 3 && y == 3){
                    System.out.print("*");
                }
                
                //Right side
                
                else if(y == 5 && x == 1 ){
                    System.out.print("*");
                }
                else if(y == 5 && x == 2){
                    System.out.print("*");
                }
                else if(y == 5 && x == 3){
                    System.out.print("*");
                }
                else if(y == 6 && x == 2 ){
                    System.out.print("*");
                }
                else if(y == 6 && x == 3 ){
                    System.out.print("*");
                }
                else if(y == 7 && x == 3){
                    System.out.print("*");
                }
                
                //The space
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }      
    }
}
