import java.util.Scanner;
public class p19 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number");
        int num=reader.nextInt();
        for(int i=1; i<=num;i++)
        {
            for(int j=1; j<=num; j++)
            {
                if((i+j)%2==0){
                 System.out.print("2"+" ");
                 // or we can use sout((i+j)%2+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
