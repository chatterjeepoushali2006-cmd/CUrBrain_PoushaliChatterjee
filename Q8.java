import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int n=sc.nextInt();
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        System.out.println(factors(n,k));
        
    }
public static int factors(int n,int k){
    List<Integer>fact = new ArrayList<>();
    for(int i=1; i*i<=n; i++)
    {
        if(n%i == 0){
            fact.add(i);
            if(i*i != n)
                fact.add(n/i);
        }
    }
    Collections.sort(fact);
    
    if(k <= fact.size())
        return fact.get(k-1);
    return -1;
}
}
