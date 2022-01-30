import java.util.*;
public class Average {
    public static void average(int a, int b, int c){
        int p = a+b+c;
        int j=p/3;
        System.out.println(j);
    }
    public static void main (String[]args) {
        Scanner input =new Scanner(System.in);
 int r= input.nextInt();
 int k =input.nextInt();
 int t= input.nextInt();
 average(r,k,t);
        
    }
}