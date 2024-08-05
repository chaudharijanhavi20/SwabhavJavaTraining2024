package ISayableTest;

import java.util.function.Supplier;

public class SupplierTest {
public static void main(String[] args) {
	Supplier<Integer> randomNumber=()->(int)(Math.random()*100000);
	System.out.println(randomNumber.get());
}
}
