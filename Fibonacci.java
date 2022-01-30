import java.util.*;

public class Fibonacci {
    public static void fib(int k) {
        int a=0;
        int b=1; 
        int c;
        System.out.println(a +" " +b);
        for(int i=2; i<=k; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
        
    }
    public static void main(String[]args) {
         Scanner input = new Scanner(System.in);
         int r = input.nextInt();
         fib(r);
    }
}
