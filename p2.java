import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = reader.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1;j<=num; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        
    }
}
