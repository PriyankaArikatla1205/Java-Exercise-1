
import java.util.*;
public class Addodd {
     public static int odd(int n){
         int sum=0;
         for(int i=1; i<=n;i++){
             if(i%2!=0){
                 sum +=i;
             }
         }
         return sum;
     }
    public static void main(String[]args){
  Scanner input =new Scanner (System .in);
  int k =input.nextInt();
   int t= odd(k);
   System.out.println(t);
    }
    
}
