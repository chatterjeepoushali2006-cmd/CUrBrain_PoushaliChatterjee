import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int store[]=sum(a);
        System.out.println(Arrays.toString(store));
}

public static int[] sum(int[] a){
    if(a.length==0)
        return a;
    int s=0;
    for(int i=a.length-1; i>=0; i--){
        int current=a[i];
        a[i]=s;
        s=s+current;

    }
    return a;
    
}}
