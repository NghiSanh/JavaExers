
/**
 * クラス Exxx3 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Exxx3
{
    public static void main(){
        
        double[] temp = {22.0, 23.5, 24.0, 24.5};
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == 24.5){
                System.out.println("I found the value " + temp[i]);
            }
        }
        
        String[] name = {"Kalam", "Jose", "Jani", "Ahmed"};
        
        for(int i = 0; i < name.length; i++){
            if(name[i] == "Kalam"){
                System.out.println("I found the name " + name[i]);
            }
        }
        
        for(int i = 0; i < name.length; i++){
                if(name[i] == "Sanh"){
                    System.out.println("Sanh is exist");
                } 
                 else{
                    System.out.println("Sanh is not exist");
                    break;
                }
        }
        
        Exer3 ex3 = new Exer3();
        ex3.searchString(name, "Kalam");
        
        int[] array = {1,2,3,4,5};
        ex3.searchInt(array,5);
    }
}
