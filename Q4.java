import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem, sum=0, pdt=1;
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        if(num>0){
        while(num > 0)
        {
            rem = num%10;
            pdt*=rem;
            sum+=rem;
            num=num/10;
        }
        System.out.println(pdt-sum);}

        else
            System.out.println("Invalid input");
    }
}
