import java.util.*;
public class Age {
    public static void  main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r= input.nextInt();
        if(r>18){
            System.out.println(" you are eligible to vote");

        }
        else{
            System.out.println(" your are not eligible");
            
        }
        
    }
}
