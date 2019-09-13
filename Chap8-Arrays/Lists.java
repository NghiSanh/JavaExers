
import java.util.ArrayList;

public class Lists
{
    static void main(){
    ArrayList<String> cars = new ArrayList<String>();
    ArrayList<Integer> numbs = new ArrayList<Integer>();
    
    cars.add("a");  //Give array cars an elements String
    cars.add("b");  //
    
    for(String i : cars){
        System.out.println(i);
    }
    
    //Make a loop for adding elements to arrays numbs 
    for(int i = 0; i < 30; i++){
       numbs.add(i); //Add 1 by 1 to Array numbs
    }
    System.out.println(numbs);
  }
}
