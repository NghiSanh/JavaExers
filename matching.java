
/**
 * Write a description of class matching here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class matching
{
    public static void main(){
        String [] a = {"W","W,","W","W","W","S","W","W","W","S"};
        String [] b = {"W","W","S","S","S","W","S","W","S","S"};
        String c = "W";
        
        
        int count = 0;
        //Check [] a
        System.out.println("Check String[] a");
        for(int i = 0; i < a.length; i++){
            if(a[i].equals(c)){
                count++;
            }
            
            
        }
        System.out.println("counts = " + count);
        if(count >= 5){
                System.out.println("OK");
            } else{
                System.out.println("NG");
            }
            
        //Check [] b
        int count2 = 0;
        System.out.println("Check String[] b");
        for(int i = 0; i < b.length; i++){
            if(b[i].equals(c)){
                count2++;
            }
            
        }
        
        System.out.println("counts = " + count2);
            if(count2 >= 5){
                System.out.println("OK");
            } else{
                System.out.println("NG");
            }
    }
}
