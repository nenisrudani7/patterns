import java.util.Scanner;

public class p20 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = reader.nextInt();
        //else we can use sout(((i*j)%2))
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i % 2 == 0) {
                    System.out.print("0"+" ");
                } else if ((i + j) % 2 == 0) {
                    System.out.print("1"+" ");
                } else if ((i + j) % 2 != 0) {
                    System.out.print("0"+" ");
                }

            }
            System.out.println();

        }
    }
}
