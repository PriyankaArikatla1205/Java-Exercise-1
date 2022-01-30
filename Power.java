import java.util.*;

public class Power {
    public static void power(double k , double l) {
         double j = Math.pow(k,l);
         System.out.println(j);
    }
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
   double a= input.nextDouble();
   double b= input.nextDouble();
   power(a,b);
        
    }
    
}
