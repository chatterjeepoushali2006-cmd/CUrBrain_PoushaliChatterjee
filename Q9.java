import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int num=sc.nextInt();
        System.out.println(nextprime((num+1)));
}
public static boolean isprime(int n)
{
    if(n<2)
        return false;
    for(int i=2; i*i<=n; i++)
    {
        if(n%i == 0)
            return false;
        
    }
    return true;
}

public static int nextprime(int n)
{
    while(isprime(n) == false){
        n++;
    }
    return n;
}
}