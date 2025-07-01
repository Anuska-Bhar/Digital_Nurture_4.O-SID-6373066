package search;

import java.util.Arrays;
public class SearchUtility {

    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.getProductId() == id)
                return p;
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int id) {
        int l = 0, r = products.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (products[mid].getProductId() == id)
                return products[mid];
            else if (products[mid].getProductId() < id)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return null;
    }
}
