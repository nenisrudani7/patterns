import java.util.*;

public class p4 {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    System.out.println("enter number");
    int num = reader.nextInt();
    for(int i=num; i>=1; i--){
        for(int j=1; j<=num; j++){
            System.out.print(i);

        }
        System.out.println();
    }
    }
    
}
