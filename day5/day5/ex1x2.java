import java.util.Random;

public class ex1x2
{
   public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
   }
   public static void main(String[] agrs){
       int[] scores = randomArray(30);
       int[] counts = new int[100];
       for (int score : scores) {
           counts[score]++;
           System.out.println("count[ " + score + "] = " +counts[score]++);
        }
       
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
