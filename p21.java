import java.util.Scanner;
public class p21 {
    public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    System.out.print("enter number");
    int num= reader.nextInt();
    for(int i=1; i<=num; i++){
        for(int j=1; j<=num; j++){
            System.out.print(((i*j)%2)+" ");
        }
        System.out.println();
    }

}
}
