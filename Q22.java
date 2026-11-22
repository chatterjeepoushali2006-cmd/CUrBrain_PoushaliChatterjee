import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF FIRST ARRAY:");
        int m=sc.nextInt();
        System.out.println("ENTER SIZE OF SECOND ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[m+n];
        int[] b=new int[n];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<m;i++) 
            a[i]=sc.nextInt();
        System.out.println("Enter elements of second array: ");
        for(int i=0;i<n;i++) 
            b[i]=sc.nextInt();
       
        
        for(int i=0; i<n; i++)
            a[m+i]=b[i];
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
            

}}
