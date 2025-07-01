package search;

import java.util.Arrays;
public class TestSearch {

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "T-shirt", "Apparel"),
            new Product(103, "Mobile", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("=== Linear Search ===");
        Product found1 = SearchUtility.linearSearch(products, 101);
        System.out.println(found1 != null ? "Found: " + found1 : "Product not found");

        System.out.println("\n=== Binary Search ===");
        Arrays.sort(products); //for binary search
        Product found2 = SearchUtility.binarySearch(products, 104);
        System.out.println(found2 != null ? "Found: " + found2 : "Product not found");

        System.out.println("\n[Analysis]");
        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
    }
}