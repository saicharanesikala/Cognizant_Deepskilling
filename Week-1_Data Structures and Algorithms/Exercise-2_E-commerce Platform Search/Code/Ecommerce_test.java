

public class Ecommerce_test {

    public static void main(String[] args) {
     
        Product[] inventory = {
            new Product(20, "carrot", "vegetable"),
            new Product(25, "onion", "vegetable"),
            new Product(27, "mango", "fruit"),
            new Product(21, "apple", "fruit"),
            new Product(24, "kiwi", "fruit")
        };

        
        int searchId = 21;

        int linearResult = Search_linear_binary.lin_search(inventory, searchId);
         displayLinearSearchResult(linearResult, inventory);

        
          Search_linear_binary.productid_sort(inventory);
        int binaryResult = Search_linear_binary.bsearch(inventory, searchId);
        displayBinarySearchResult(binaryResult, inventory);
    }
    
     private static void displayLinearSearchResult(int index, Product[] inventory) {
        if (index != -1) {
            System.out.println("Linear_Search Result: " + inventory[index].toString());
        } else {
            System.out.println("Linear_Search:Product ID not found_");
        }
    }
    
      private static void displayBinarySearchResult(int index, Product[] inventory) {
        if (index != -1) {
            System.out.println("Binary Search Result: "+ inventory[index].toString());
        }  
        else {
            System.out.println("Binary_Search: Product ID not found_");
        }
    }
}