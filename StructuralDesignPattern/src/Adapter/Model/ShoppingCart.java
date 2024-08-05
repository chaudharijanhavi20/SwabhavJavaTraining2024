package Adapter.Model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	 private List<IItems> items = new ArrayList<>();

	    public void addItem(IItems item) {
	        items.add(item);
	    }

	    public List<IItems> getCartItems() {
	        return items;
	    }

	    public double getCartPrice() {
	        return items.stream().mapToDouble(IItems::getItemPrice).sum();
	    }
}
