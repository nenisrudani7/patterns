public class p33{
    public static void main(String a[]){
        int n=5;
        for(int i=1; i<=5; i++)
        {
            int x=n-i;
            for(int j=1; j<=5; j++){
                System.out.print((char)(x+65)+" ");
                x=x+n;
            }
            System.out.println();
        }
    }
}