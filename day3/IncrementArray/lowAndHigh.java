import java.util.Random;

public class lowAndHigh
{
    public static void main(){
        int[] values = {1,2,3,4,5};
        for(int value : values){
            System.out.println(value);
        }
        int[] scores = randomArray(100);
        int a = inRange(scores,90,100);
        System.out.println(a);
        
        int b = inRange(scores,80,90);
        System.out.println(b);
    }
    
    public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
    }
    
    public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= low && a[i] < high) {
            count++;
        }
    }
    return count;
    }
}
