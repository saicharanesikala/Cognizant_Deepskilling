import java.util.*;


public class Search_linear_binary {
	
	
	public static int bsearch(Product products[], int targetId) {
		int l = 0;
		int r = products.length;
		int mid = 0;
		int flag=0;
		while(l <= r) {
			mid = (l +r)/2;
			if(products[mid].getProductId() == targetId) {
				return mid;
			}
			else if(products[mid].getProductId() > targetId) {
				//updating variables search size..
				r= mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		return -1;
	}
	

public static int lin_search(Product products[], int targetId) {
		
		for(int k = 0; k < products.length; k++) {
			if(products[k].getProductId() == targetId) {
				return k;
			}
		}
		return -1;
		
}
	
	
	
	  public static void productid_sort(Product[] products) {
		 
		 Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
	}
	
}
