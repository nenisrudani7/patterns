import java.util.Scanner;
public class p8{
    
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter the number:- ");
     int k=2;
     int num = reader.nextInt();
     for(int i=1; i<=num; i++){
        for(int j=1; j<=num; j++){
            System.out.print(k+" ");
            k+=2;
        }
        System.out.println();
     }
    }
}
