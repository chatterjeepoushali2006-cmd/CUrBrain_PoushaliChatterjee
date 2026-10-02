import java.util.*;
public class Q3{

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println(palindrome(num));
    }
    
    public static int palindrome(int num)
    {
        int rem,rev=0, store=num;
        if(num==0)
            return 0;
        while(num != 0)
        {
            rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev == store)
            return store;
        else
            return (store+rev);
    }
}