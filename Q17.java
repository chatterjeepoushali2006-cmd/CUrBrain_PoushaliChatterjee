
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q17 {
    
    public static int MostPopular(int[] sales) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int id : sales) {
            frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
        }
        
        int maxFrequency = -1;
        int mostPopularId = Integer.MAX_VALUE;
        
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentId = entry.getKey();
            int currentFrequency = entry.getValue();
            
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostPopularId = currentId;
            } else if (currentFrequency == maxFrequency) {
                if (currentId < mostPopularId) {
                    mostPopularId = currentId;
                }
            }
        }
        
        return mostPopularId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the sales array: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The array must contain at least one element.");
            return;
        }
        
        int[] sales = new int[n];
        System.out.println("Enter the product IDs (separated by spaces or newlines):");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter valid integers only.");
                scanner.next(); 
            }
            sales[i] = scanner.nextInt();
        }
        
        
        int res = MostPopular(sales);
        System.out.println("The most popular product ID is: " + res);
        
        scanner.close();
    }
}
