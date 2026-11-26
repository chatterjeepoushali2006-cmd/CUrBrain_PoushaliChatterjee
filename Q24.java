import java.util.Scanner;

public class Q24 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter target sum: ");
        int target=sc.nextInt();
       int prev=Integer.MAX_VALUE; 
       int start =-1;
       int end =-1;
       for(int i=0; i<n; i++){
        int sum=0;
        for(int j=i;j<n; j++){
            sum=sum+a[j];
            if(sum>=target){
                int current = (j - i) + 1; 
                
                if(current<prev){
                    prev=current;
                    start=i;
                    end=j;
                }
                
                break;
        }}
       
    }
    if(start==-1)
        System.out.println("0");
    else
        System.out.println("LENGTH IS: "+(end-start+1));
    }
}

