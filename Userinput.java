import java.util.*;

public class Userinput {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        // number of input number inputs
        int p =0;
        int ne =0;
        int z=0;

        int n=input.nextInt();
for(int i=0; i<=n; i++){
             int k =input.nextInt();
                if(k>0){
                    p++;
                }
                else if(k<0){
                    ne++;

                }
                else{
                    z++;
                }
            
            System.out.println(p+" " + ne +  " " +z);
}
    }
    
}
