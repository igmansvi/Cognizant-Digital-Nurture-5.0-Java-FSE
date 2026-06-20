/*
    Big O notation
    - Worst case complexity of any algorithm
    - complexity defines by amount of time and space/memory taken by algorithm as input grows
*/

/*
    Cases for Search Operation
    - Best case: we find the target as soon as we started giving us O(1) complexity
    - Worst case: we iterates at most as much input we have and finds at last giving use o(n) complexity
    - Average case: we iterates some and inbetween we find the target, but stills O(n) complexity

    In case of Linear Search
    - Best and Worst case: Best if we find at first and Worst if we find at last, complexity: O(n)

    In case of Binary Search
    - Prerequisite: Sorted array
    - Best and Worst case: Best if we find at middle and Worst if we iterated all then find the target, complexity: O(log n)
*/

import java.util.Arrays;

public class E_CommercePlatform {
    /*
        Product class
        - stores productId, productName, category
        - provides functions to get these
        - provides overriden function to print product
    */
    public static class Product {
        private final int productId;
        private final String productName;
        private final String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return "{\n \tId: " + this.getProductId() + '\n' + "\tName: " + this.getProductName() + '\n'
                    + "\tCategory: " + this.getCategory() + "\n}";
        }
    }

    /*
        Sort the product array based on id, if equal based on name;
    */
    public void sortProducts(Product[] products) {
        Arrays.sort(products, (a, b) -> {
            if (a.getProductId() == b.getProductId()) {
                return a.getProductName().compareTo(b.getProductName());
            }
            return Integer.compare(a.getProductId(), b.getProductId());
        });
    }

    /*
        Linear search on Products array
    */
    public Product searchProductByIdUsingLinearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    /*
        Binary Search on Products array
    */
    public Product searchProductByIdUsingBinarySearch(Product[] products, int productId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midId = products[mid].getProductId();
            if (midId == productId) {
                return products[mid];
            }
            if (productId < midId) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    /*
        Search Product by Id
        - option to choose which search type
    */
    public Product searchProductById(Product[] products, int productId, int searchType) {
        switch (searchType) {
            case 0:
                return searchProductByIdUsingLinearSearch(products, productId);
            case 1:
                return searchProductByIdUsingBinarySearch(products, productId);
            default:
                return null;
        }
    }

    /*
        Builds the Products array with static data
    */
    public Product[] buildProductArray() {
        return new Product[] {
                new Product(105, "Smartwatch", "Wearables"),
                new Product(102, "Smartphone", "Mobile"),
                new Product(101, "Laptop", "Computers"),
                new Product(104, "Headphones", "Audio"),
                new Product(103, "Tablet", "Mobile")
        };
    }

    public static void main(String[] args) {
        E_CommercePlatform inventory = new E_CommercePlatform();
        Product[] products = inventory.buildProductArray();

        Product product1 = inventory.searchProductById(products, 103, 0);
        System.out.println(product1);

        inventory.sortProducts(products);

        Product product2 = inventory.searchProductById(products, 103, 1);
        System.out.println(product2);
    }
}

/*
    Time complexity comparisons
    - Linear search O(n)
    - Binary search O(log n)

    For our platform, binary search peaks at performance, requires less searching but comes with tradeoff of sorted array required.
*/