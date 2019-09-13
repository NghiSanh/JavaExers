
/**
 * クラス mondai1 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class mondai1
{
    static String enhancedString(String[] array){
        
        for(String copy : array){
            System.out.println(copy);
        }
        return "copied";
    }
    
    static int enhancedInt(int[] array){
        
        for(int copy : array){
            System.out.println(copy);
        }
        return 1;
    }
    
    static double enhancedDouble(double[] array){
        
        for(double copy : array){
            System.out.println(copy);
        }
        return 1;
    }
    
    public static void main(){
        double[] values = {22.5,18.2,5.0};
        enhancedDouble(values);
        
        String[] name = {"Sanh","Nghi","Phun"};
        enhancedString(name);
    }
}
