import java.util.*;
public class j9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number:--");
        int num= reader.nextInt();
        for(int i=1; i<=num; i++){
          for(int j=1; j<=num; j++){
            System.out.print(i*j+"  ");
         
          }
          System.out.println();
        }
}
}
