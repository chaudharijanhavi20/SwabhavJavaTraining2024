package Decorator.Model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		return hat.getName() + " with Ribbon";
	}

	@Override
	public double getPrice() {
		return hat.getPrice() + 100;
	}

	@Override
	public String getDescription() {
		return hat.getDescription() +" With ribbon hat .";
	}
}