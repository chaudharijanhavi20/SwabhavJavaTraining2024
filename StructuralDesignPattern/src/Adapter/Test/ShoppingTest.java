package Adapter.Test;

import Adapter.Model.Hat;
import Adapter.Model.HatAdapter;
import Adapter.Model.ShoppingCart;

public class ShoppingTest {
	public static void main(String[] args) {
		Hat hat = new Hat("CAP", "long1", 1000, 50);
		Hat hat2 = new Hat("CAP", "long2", 1070, 55);
		HatAdapter hatAdapter = new HatAdapter(hat);
		HatAdapter hatAdapter1 = new HatAdapter(hat2);
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(hatAdapter);
		cart.addItem(hatAdapter1);
		double totalPrice = cart.getCartPrice();
		System.out.println("Total price: " + totalPrice);
	}

}
