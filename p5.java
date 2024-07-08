import java.util.*;
public class p5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
     System.out.println("enter number");
        int num = reader.nextInt();
        for(int i=num; i>=1; i--){
            for(int j=num; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
