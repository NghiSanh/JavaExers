import java.util.Random;
import java.util.Arrays;
/**
 * クラス Exer3 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Exer3
{
    //Main
    public static void main(){
        double[] a = {26.0, 24.5, 22.3};
        
        int[] numbers = {1,2,3};
        //Find the number
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 3){
                System.out.println("Found the value " + numbers[i]);
            }
            
        }
        
        //Average
        double average;
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            
        }
        average = sum / (numbers.length);
        System.out.println(average);
        
        //Create a random array
        int value = 5;
        int[] array = randomArray(value);
        System.out.println(Arrays.toString(array));
        
        //Create String array and find names
        String[] names = {"Sanh","Phun","Nghi"};
        for(int i = 0; i < numbers.length; i++){
           if(names[i] == "Nghi"){
               System.out.println("Found the name " + names[i]);
            }
        }
        
        //Search double numbers
        double[] c = {10.0,20.0,30.0,40.0,50.0};
        System.out.println(searchDouble(c,40.0));
        
        //Search int numbers
        int[] d = {1,2,3,4,5,6};
        System.out.println(searchInt(d,5));
        
        //Search String
        System.out.println(searchString(names,"Phun"));
    }
    
    //Double
    public static double searchDouble(double[] array, double target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("Found the value: " + array[i]);
                return array[i];
            }
        }return 0;
    }
    
    //Int
    public static int searchInt(int[] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("Found the value: " + array[i]);
                return array[i];
            }
        }return 0;
    }
    
    //String
    public static String searchString(String[] array, String target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("Found the string: " + array[i]);
                return array[i];
            }
        }return "not found";
    }
    
    //Random
    public static int[] randomArray(int value){
        Random random = new Random();
        int[] a = new int[value];
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
