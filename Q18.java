import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter starting index: ");
        int start=sc.nextInt();
        System.out.print("Enter ending index: ");
        int end=sc.nextInt();
        reverse(a, start, end);
        System.out.print("[");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+(i<a.length-1?",":""));
        System.out.print("]");
    }

public static void reverse(int[] arr, int start, int end)
{
    int left=start;
    int right=end;
    while(left < right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
}
}