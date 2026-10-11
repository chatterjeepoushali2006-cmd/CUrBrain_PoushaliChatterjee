import java.util.*;
class Q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();
        caluculate(arr);
        

    }
    public static void caluculate(int a[]){
        if(a.length == 0)
            return;
        int i=1,store=a[0],lcm=a[0];
        while(i<a.length)
        {
            store=gcd(store,a[i]);
            lcm=(lcm*a[i])/gcd(lcm,a[i]);
            i++;
        }
        System.out.println("GCD is: "+store);
        System.out.println("LCM is: "+lcm);
    }

    public static int gcd(int dis, int did){
        while(did !=0){
            int temp=did;
            did=dis%did;
            dis=temp;
        }
        return dis;
    }
}