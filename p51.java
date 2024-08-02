import java.util.*;

public class p51 {
    public static void main(String args[]){
         Scanner reader = new Scanner(System.in);
         System.out.println("enter number:-");
         int n=reader.nextInt();
         
        int k=(n*(n+1))/2;
        for(int i=n; i>=1; i--){
            for(int j=n; j>=i; j--){
                System.out.print(k+" ");
                k--;
            }
            System.out.println("");
        }
    }
}
