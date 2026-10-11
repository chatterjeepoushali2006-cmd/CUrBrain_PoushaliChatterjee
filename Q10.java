import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("No primes below 0");
        else if(num<=2)
            System.out.println("No prime strictly less than 2");
        else
            System.out.println(prime(num));
        
}
public static int prime(int n)
{
    boolean[] isprime=new boolean[n+1];
    int count=0;
    for(int i=2; i*i<=n; i++){
        if(isprime[i] == false)
        {
            for(int j=i*i; j<=n; j=j+i)
                isprime[j]=true;
        }
    }
    for(int i=2; i<=n; i++){
        if(isprime[i] == false)
            count++;
    }
    return count;
}
}
