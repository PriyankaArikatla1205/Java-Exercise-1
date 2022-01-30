import java.util.*;
public class Greatest {
    public static void greatest(int a, int b) {
        int p = Math.max(a, b);
        System.out.println(p);
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int t=input.nextInt();
        greatest(k,t);
        
    }
}
