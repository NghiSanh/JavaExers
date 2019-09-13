public class seconds
{
   public static void main(){
       int hours,minutes,seconds;
       
       hours = 5000 / 3600;
       minutes = (5000 % 3600) / 60;
       seconds = (5000 % 3600) % 60;
       
       System.out.printf("%d hours, %d minutes, %d seconds",hours, minutes, seconds);
    }
}
