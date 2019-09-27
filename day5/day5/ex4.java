import java.util.Collections;
import java.util.Arrays;
public class ex4
{
    public static void main(String[] args){
        ex1x2 ran = new ex1x2();
        int[] ar = ran.randomArray(10);
        System.out.println(Arrays.toString(ar));
        
        System.out.println("Max is " + indexOfMax(ar));
        
    }
    static int indexOfMax(int[] arr){
        int max = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            else if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}