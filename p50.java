public class p50 {
    public static void main(String args[]){
        int n=5;
        int x=1;
        int y=n;
        int t1;
        int t2;
        int r1;
        int r2;
        for(int i=n; i>=1; i--){
            t1=x;
            t2=y;
            r1=i;
            r2=i+1;
            for(int j=n; j>=i; j--){
                if((i+j)%2==1){
                    System.out.print(" "+t1);
                }
                else{
                    System.out.print(" "+t2);
                }
                t1=t1-r1++;
                t2=t2-r2++;
            }
            y=y+i-1;
            x=x+i;
            System.out.println();
        }
    }
}
