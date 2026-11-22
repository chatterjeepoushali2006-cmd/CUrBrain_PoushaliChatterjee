import java.util.Arrays;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter target:");
        int target=sc.nextInt();
        int store[]=search(a,target);
        System.out.println(Arrays.toString(store));
}

public static int[] search(int[] a, int key){
    if(a.length==0)
        return a;
    boolean flag=false;
    for(int i=0; i<a.length; i++){
        if(a[i]==key){
            flag=true;
            for(int j=i;j<=a.length-2;j++)
                a[j]=a[j+1];
            break;
        }
        
    }
    if(flag==false){
        int[] res=new int[a.length];
    for(int k=0; k<a.length; k++)
        res[k]=a[k];
    return res;
    }
    else{
    int[] res=new int[a.length-1];
    for(int k=0; k<a.length-1; k++)
        res[k]=a[k];
    return res;
}
}}