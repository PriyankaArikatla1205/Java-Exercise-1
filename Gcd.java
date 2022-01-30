import java.util.*;

public class Gcd {
     public static void gcd(int t, int k){
         int j=1;
 for(int i=1; i<=t && i<=k;i++){
     if(k%i==0 &&t%i==0){
 j=i;
     }

 }
 System.out.println(j);
     }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        gcd(a,b);
    }
    
}
