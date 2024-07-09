import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number:--");
        int num= reader.nextInt();
        for(int i=1; i<=num; i++){
          for(int j=1; j<=3; j++){
            System.out.print(j+ " "+i+" ") ;
          }
          System.out.println();
        }
}
}
