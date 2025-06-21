
import java.util.*;


public class Search_linear_binary {

public static int lin_search(Product products[], int targetId) {
		
		for(int i = 0; i < products.length; i++) {
			if(products[i].getProductId() == targetId) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int bsearch(Product products[], int targetId) {
		int left = 0;
		int right = products.length;
		int mid = 0;
		int flag=0;
		while(left <= right) {
			mid = (left + right)/2;
			if(products[mid].getProductId() == targetId) {
				return mid;
			}
			else if(products[mid].getProductId() < targetId) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	  public static void productid_sort(Product[] products) {
		 Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
	}
	
}
