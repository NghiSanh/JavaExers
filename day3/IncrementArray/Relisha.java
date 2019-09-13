import java.util.Random;
import java.util.Arrays;
/**
* クラス Exercise2 の注釈をここに書きます.
*
* @author (あなたの名前)
* @version (バージョン番号もしくは日付)
*/
public class Relisha{
   public static int[]randomArray(int size){
       Random random = new Random();
       int []a = new int[size];
       for(int i=0; i<a.length;i++){
           a[i] = random.nextInt(size);
       }
       return a;
   }
   public static int inRange(int[]a,int low,int high){
       int count =0;
       for(int i=0; i<a.length;i++){
           if(a[i]>=low&&a[i]<high){
               count++;
           }
       }
       return count;
   }
   public static void main (String[]args){
       int[]scores = randomArray(30);
       int[]counts = new int[30];
       for(int i=0; i<counts.length;i++){
           counts[i] = inRange(scores,i,i+1);
           

       }
       System.out.print(Arrays.toString(scores));
   }
}