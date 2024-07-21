import java.util.Scanner;

public class p46 {
    public static void main(String a[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();
        int k = 2;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k += 2;
            }
            System.out.println();

        }
    }

}
