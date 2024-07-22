public class p48 {
    public static void main(String a[])
    {
        int n = 5;
        int start =1;
        for(int i=1; i<=n; i++)
        {
            int num= start;
            for(int j=1; j<=i; j++){
                System.out.print(num-- +" ");
            }
            start+=2;
            System.out.println();
        }
        
    }
}


// public class p48 {
//     public static void main(String a[])
//     {
//         int n = 5;
//         int start =1;
//         for(int i=1; i<=n; i++)
//         {
//             int num= start;
//             for(int j=1; j<=i; j++){
//                 System.out.print(num-- +" ");
//             }
//             start+=2;
//             System.out.println();
//         }
        
//     }
// }
