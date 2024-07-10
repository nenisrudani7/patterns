import java.util.*;
public class p14 {
 public static void main(String args[]){
    Scanner reader = new Scanner(System.in);
    System.out.print("enter number");
    int n = reader.nextInt();
    int k=0;
    for(int i=1; i<=n; i++){
         k=i;
        for(int j=1; j<=n; j++){
            System.out.print(k+" 5");
            k+=5;
        }
       System.out.println();
    }
    
    
 }
}
