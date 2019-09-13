import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class atClass1
{
    public static void main(String[] args){
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Japan");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Bangladesh");
        
        Collections.sort(countries); //sort the name of countries
        
        for(String i : countries){
            System.out.print(i + " "); //Print the name of countries one by one
        }
        System.out.println();
        System.out.println("How many contries? : "+countries.size());
        Scanner scan = new Scanner(System.in); //Input the name
        
        String[] country = new String[1];
        country[0] = scan.nextLine();
        printArray(country);
        System.out.println("How many contries? : "+country.length);
    }
     static void printArray(String[] array){
        for(String i : array){
            System.out.println(i);
        }
    }
}
