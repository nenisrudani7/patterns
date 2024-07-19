public class p43 {
    public static void main(String a[]) {
        for (int i = 1; i <= 5; i++) {
          int k=i-1;
            for (int j = 1; j <= i; j++) {
                System.out.print((k+i)+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}
