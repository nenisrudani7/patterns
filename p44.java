public class p44 {
    public static void main(String args[]){
        int k=0;
        int n=4;
        for(int i=1; i<=n; i++){
            k+=i;
            for(int j=k; j>k-i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
