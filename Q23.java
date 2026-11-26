import java.util.Scanner;

public class Q23 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int min_sum=Integer.MAX_VALUE;
       for(int i=0; i<n; i++){
        int sum=0;
        for(int j=i;j<n; j++){
            sum=sum+a[j];
            if(sum<min_sum)
                min_sum=sum;
        }
        
       }
       System.out.println("MINIMUM SUM OF SUB-ARRAY "+min_sum);
}
}