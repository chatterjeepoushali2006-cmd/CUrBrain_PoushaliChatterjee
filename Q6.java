import java.util.*;

public class Q6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.print("Enter first number to search: ");
        int n1=sc.nextInt();
        System.out.print("Enter second number to search: ");
        int n2=sc.nextInt();
        if(num<0 || n1<0 || n1>9 || n2<0 || n2>9){
            System.out.println("Invalid input");
            return;
        }
        System.out.println(difference(num, n1, n2));
    }

        public static int difference(int num, int n1, int n2){
        int rem, c1=0, c2=0;
        do{
            rem = num%10;
            if(rem == n1) c1++;
            if(rem == n2) c2++;
            num /=10;
        }while (num>0);
        return Math.abs(c1-c2);
    }
}