import java.util.*;
public class Q2 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int num, rev=0,rem;
        System.out.println("Enter number: ");
        num=sc.nextInt();
        if(num==0){
            System.out.println("0");
            return ;}
        while(num != 0)
        {
            rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Result : "+(rev*2));
}
}
