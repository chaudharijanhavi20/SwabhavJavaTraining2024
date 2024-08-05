package Tests;

import Overriding.Base;
import Overriding.Derived1;
import Overriding.Derived2;

public class BaseTests {
	public static void main(String[] args) {
		Base base = new Base();
		base.display();

		Derived1 derived1 = new Derived1();
		base = derived1;
		base.display();

		Derived2 derived2 = new Derived2();
		base = derived2;
		base.display();
	}
}
