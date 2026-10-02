import java.util.*;
class Q1{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        int count=0;
        System.out.println("Enter number: ");
        long num=sc.nextLong();
        if(num == 0){
            System.out.println("false");
            return;
        }
        while(num != 0)
        {
            count++;
            num=num/10;
        }
        if(count % 2==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}